package com.skillratservice.implement;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.skillratservice.model.SkillRatRequestModel;
import com.skillratservice.repository.SkillratRepositry;
import com.skillratservice.requestdao.Skillratservicedao;
import com.skillratservice.service.SkillRatRequestService;

@Service("skillratImplement")
public class SkillratImplement implements SkillRatRequestService {

	@Resource(name = "skillratRepositry")
	private SkillratRepositry skillRatRepository;

	@Override
	public Skillratservicedao saveRequest(SkillRatRequestModel requestModel) {
		Skillratservicedao Skillratservicedao = new Skillratservicedao();
		Skillratservicedao.setDescription(requestModel.getDescription());
		if (requestModel.getName().equals("Sam")) {
			Skillratservicedao.setName("Sam");
		} else {

			Skillratservicedao.setName("None");
		}
		return skillRatRepository.save(Skillratservicedao);
	}

	public Skillratservicedao getDetails(Long id) {
		Optional<Skillratservicedao> servicedaoId = skillRatRepository.findById(id);
		if (servicedaoId != null) {
			return servicedaoId.get();
		}
		return null;
	}

	@Override
	public List<Skillratservicedao> getAllDetails() {
	
		return skillRatRepository.findAll();
	} 

	@Override
	public Page<Skillratservicedao> findAll(int pageno, int pagesize) {
		PageRequest pageable = PageRequest.of(pageno, pagesize);
		return skillRatRepository.findAll(pageable) ;
	}

}
