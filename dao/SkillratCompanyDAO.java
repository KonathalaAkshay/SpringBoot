package com.skillratcompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillratcompany.requestmodel.SkillratCompanyModel;

@Repository("SkillratCompanyDAO")
public interface SkillratCompanyDAO extends JpaRepository<SkillratCompanyModel, Long> {

}
