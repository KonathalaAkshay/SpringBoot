package com.skillratservice.requestdao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="model")
public class Skillratratmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	@OneToOne
	@JoinColumn(name="model_id")
	private Skillratservicedao servicedao;
	public Skillratservicedao getServicedao() {
		return servicedao;
	}
	public void setServicedao(Skillratservicedao servicedao) {
		this.servicedao = servicedao;
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
