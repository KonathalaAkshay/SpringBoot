package com.skillratservice.model;

public class dao {

	private Long id;
	private String fname;
	private SkillRatRequestModel model;

	public SkillRatRequestModel getModel() {
		return model;
	}

	public void setModel(SkillRatRequestModel model) {
		this.model = model;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

}
