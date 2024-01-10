package com.bvr;

public class Disease {

	public Disease() {
		// TODO Auto-generated constructor stub
	}
	
	private String id;
	private String description;
	private String prescription;
	public Disease(String id, String description, String prescription) {
		super();
		this.id = id;
		this.description = description;
		this.prescription = prescription;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	

}
