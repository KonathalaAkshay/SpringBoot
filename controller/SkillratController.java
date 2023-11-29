package com.skillratservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.skillratservice.model.SkillRatRequestModel;
import com.skillratservice.model.dao;
import com.skillratservice.requestdao.Skillratratmodel;
import com.skillratservice.requestdao.Skillratservicedao;
import com.skillratservice.service.SkillRatRequestService;

@RestController
@RequestMapping("/Skillrat")
public class SkillratController {

	@Resource
	private SkillRatRequestService skillRequestService;

	@Transactional
	@PostMapping("/save")
	public Skillratservicedao saveSkillRat(@RequestBody SkillRatRequestModel skillratrequestmodel) {
		
		return skillRequestService.saveRequest(skillratrequestmodel);
		 
	}
	@GetMapping("/data")
	public SkillRatRequestModel getData(@RequestParam Long id) {
		Skillratservicedao skillratservicedao = skillRequestService.getDetails(id);
		if(null != skillratservicedao) {
			SkillRatRequestModel skillRatRequestModel = new SkillRatRequestModel();
			skillRatRequestModel.setId(skillratservicedao.getId());
			skillRatRequestModel.setName(skillratservicedao.getName());
			return skillRatRequestModel;
		}return null;
	}
	@PostMapping("/all")
	public List<SkillRatRequestModel> getFindAll(){
		List<Skillratservicedao> servicedaoData = skillRequestService.getAllDetails();
		List<SkillRatRequestModel> listrequestmodel = new ArrayList<SkillRatRequestModel>();
		for (Skillratservicedao dao : servicedaoData) {
			SkillRatRequestModel skillratrequestmodel  = new SkillRatRequestModel();
			skillratrequestmodel.setId(dao.getId());
			skillratrequestmodel.setName(dao.getName());
			skillratrequestmodel.setDescription(dao.getDescription());
			listrequestmodel.add(skillratrequestmodel);
		}return listrequestmodel;
		
	}
	@GetMapping("/page")
	public Page<Skillratservicedao> findAll(@RequestParam int pageno, int pagesize){
		return skillRequestService.findAll(pageno, pagesize);
	}
	
	@PostMapping("/model")
	public Skillratratmodel getAll(@RequestBody Skillratservicedao skillratdao) {
		SkillRatRequestModel model = new SkillRatRequestModel();
		model.setName(skillratdao.getName());
		model.setDescription(skillratdao.getDescription());
		
		return null;
		
		
	}
	
}
