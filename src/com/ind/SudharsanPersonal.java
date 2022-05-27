package com.ind;

public class SudharsanPersonal {
	public void Name() {
		System.out.println("NAME:SUDHARSAN SD");
	}

	public void Age() {
		System.out.println("AGE:28");
	}

	public void DOB() {
		System.out.println("DOB:14JANUARY1994");
	}

	public static void main(String[] args) {
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
