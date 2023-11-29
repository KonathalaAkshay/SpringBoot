package com.skillratcompany.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillratcompany.dao.SkillratEmployeeDAO;
import com.skillratcompany.requestdto.SkillratCompanyDTO;
import com.skillratcompany.requestdto.SkillratEmployeeDTO;
import com.skillratcompany.requestmodel.SkillratCompanyModel;
import com.skillratcompany.requestmodel.SkillratEmployeeModel;
import com.skillratcompany.service.SkillratCompanyService;

@RestController
@RequestMapping("/company")
public class SkillratCompanyController {

	@Resource(name = "SkillratCompanyServiceImplement")
	private SkillratCompanyService skillratcompanyservice;

	@Resource(name = "SkillratEmployeeDAO")
	private SkillratEmployeeDAO skillratemployeedao;

	@PostMapping("/save")
	public SkillratCompanyModel saveDetails(@RequestBody SkillratCompanyDTO skillratcompanydto) {
		return skillratcompanyservice.saveDetails(skillratcompanydto);
	}

	@GetMapping("/findid")
	public SkillratCompanyDTO findById(@RequestParam Long id) {
		SkillratCompanyModel skillratcompanymodel = skillratcompanyservice.findById(id);
		if (null != skillratcompanymodel) {
			SkillratCompanyDTO skillratcompanydto = new SkillratCompanyDTO();
			skillratcompanydto.setId(skillratcompanymodel.getId());
			skillratcompanydto.setName(skillratcompanymodel.getName());
			return skillratcompanydto;
		}
		return null;
	}

	@PostMapping("/link")
	public SkillratEmployeeModel create(@RequestBody SkillratEmployeeDTO skillratemployeedto) {
		SkillratEmployeeModel skillratemployeemodel = new SkillratEmployeeModel();
		skillratemployeemodel.setName(skillratemployeedto.getName());

		SkillratCompanyModel skillratcompaymodel = skillratcompanyservice
				.findById(skillratemployeedto.getEmployee_id());

		if (null != skillratcompaymodel) {
			skillratemployeemodel.setSkillratcompanymodel(skillratcompaymodel);
			skillratemployeedao.save(skillratemployeemodel);
			return skillratemployeemodel;
		}
		return null;

	}
}
