package com.skillratcompany.serviceimplement;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skillratcompany.dao.SkillratCompanyDAO;
import com.skillratcompany.requestdto.SkillratCompanyDTO;
import com.skillratcompany.requestmodel.SkillratCompanyModel;
import com.skillratcompany.service.SkillratCompanyService;

@Service("SkillratCompanyServiceImplement")
public class SkillratCompanyServiceImplement implements SkillratCompanyService {

	@Resource(name="SkillratCompanyDAO")
	private SkillratCompanyDAO skillratcompanydao;

	@Override
	public SkillratCompanyModel saveDetails(SkillratCompanyDTO skillratcompanydto) {
		SkillratCompanyModel skillratcompanymodel = new SkillratCompanyModel();
		skillratcompanymodel.setName(skillratcompanydto.getName());

		return skillratcompanydao.save(skillratcompanymodel);
	}

	@Override
	public SkillratCompanyModel findById(Long id) {
		Optional<SkillratCompanyModel> ModelId = skillratcompanydao.findById(id);
		if(ModelId != null) {
			return ModelId.get();
		}
		return null;
	}

}
