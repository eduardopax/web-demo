package com.webdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long dataCreation;

	private String hostname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Long getDataCreation() {
		return dataCreation;
	}

	public void setDataCreation(Long dataCreation) {
		this.dataCreation = dataCreation;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", dataCreation=" + dataCreation + ", hostname=" + hostname + "]";
	}

}
