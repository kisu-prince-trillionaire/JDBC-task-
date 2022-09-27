package com.company.test;

import com.company.bean.Company;
import com.company.dao.CompanyDao;

public class Tester {

	public static void main(String[] args) {
		addCompany();
	}

	public static void addCompany() {
		try {
			Company company = new Company(105, "Bhavna", 30000, "Banglore", "2022-10-11");
			CompanyDao obj = new CompanyDao();
			int i = obj.addCompany(company);
			if (i > 0) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
