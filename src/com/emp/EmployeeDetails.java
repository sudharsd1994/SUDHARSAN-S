package com.emp;

import com.ind.EducationQualification;
import com.ind.SudharsanPersonal;

public class EmployeeDetails {
	private void Sudharsan() {
		System.out.println("2015-2016 - GET");
	}

	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.Sudharsan();
		SudharsanPersonal sp = new SudharsanPersonal();
		sp.Name();
		sp.Age();
		sp.DOB();
		EducationQualification eq = new EducationQualification();
		eq.SSLC();
		eq.HSC();
		eq.UG();
	}
}
