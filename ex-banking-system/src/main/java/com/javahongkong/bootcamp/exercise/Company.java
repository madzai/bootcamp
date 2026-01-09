package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder {
	private String companyName;

	public Company(String companyName, int taxId) {
		// complete the function
		this.companyName = companyName;
		this.taxId = super.getIdNumber();
	}

	public String getCompanyName() {
		// complete the function
		return this.companyName;
	}
}
