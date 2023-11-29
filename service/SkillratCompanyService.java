package com.skillratcompany.service;

import com.skillratcompany.requestdto.SkillratCompanyDTO;
import com.skillratcompany.requestmodel.SkillratCompanyModel;

public interface SkillratCompanyService {
	
	SkillratCompanyModel saveDetails(SkillratCompanyDTO skillratcompanydto);
	SkillratCompanyModel findById(Long id);
	
}
