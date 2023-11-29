package com.skillratcompany.requestmodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class SkillratEmployeeModel {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "name")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id")
	private SkillratCompanyModel skillratcompanymodel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SkillratCompanyModel getSkillratcompanymodel() {
		return skillratcompanymodel;
	}

	public void setSkillratcompanymodel(SkillratCompanyModel skillratcompanymodel) {
		this.skillratcompanymodel = skillratcompanymodel;
	}

}
