package com.skillratcompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillratcompany.requestmodel.SkillratEmployeeModel;

@Repository("SkillratEmployeeDAO")
public interface SkillratEmployeeDAO extends JpaRepository<SkillratEmployeeModel, Long> {

}
