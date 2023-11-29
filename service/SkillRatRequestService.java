package com.skillratservice.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.skillratservice.model.SkillRatRequestModel;
import com.skillratservice.requestdao.Skillratservicedao;

public interface SkillRatRequestService {
	Skillratservicedao saveRequest(SkillRatRequestModel requestModel);
	Skillratservicedao getDetails(Long id);
	List<Skillratservicedao> getAllDetails();
	Page<Skillratservicedao> findAll(int pageno, int pagesize); 
	
}

