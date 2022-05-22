package com.vaccine_Registration;

public class Applicant {
	private String adhno;
	private String name, city, state, mobno, emailId,pwd;
	private String pregnancy, diabetes, other, gender, pncd, dob; // other = other illnesses
	
	Applicant(String adh_no, String nme, String date, String gen, String ct,String st, String pin, String mob, String email, String preg, String dia, String oth, String pass){
		adhno = adh_no;
		name = nme;
		dob = date;
		gender = gen;
		city = ct;
		state = st;
		pncd = pin;
		mobno = mob;
		emailId = email;
		pregnancy = preg;
		diabetes = dia;
		other = oth;
		pwd=pass;
	}
	
	public String getAdhno() {  
	    return adhno;  
	}  
	  
	public void setAdhno(String adhno) {  
	    this.adhno = adhno;  
	}
	
	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}
	
	public String getDob() {  
	    return dob;  
	}  
	  
	public void setDob(String dob) {  
	    this.dob = dob;  
	}
	
	public String getGender() {  
	    return gender;  
	}  
	  
	public void setGender(String gender) {  
	    this.gender = gender;  
	}
	
	public String getCity() {  
	    return city;  
	}  
	  
	public void setCity(String city) {  
	    this.city = city;  
	}
	
	public String getState() {  
	    return state;  
	}  
	  
	public void setState(String state) {  
	    this.state = state;  
	}
	
	public String getPin() {  
	    return pncd;  
	}  
	  
	public void setPin(String pncd) {  
	    this.pncd = pncd;  
	}
	
	public String getMob() {  
	    return mobno;  
	}  
	  
	public void setMob(String mob) {  
	    this.mobno = mob;  
	}
	
	public String getPreg() {  
	    return pregnancy;  
	}  
	  
	public void setPreg(String preg) {  
	    this.pregnancy = preg;  
	}
	
	public String getDia() {  
	    return diabetes;  
	}  
	  
	public void setDia(String dia) {  
	    this.diabetes = dia;  
	}
	
	public String getOther() {  
	    return other;  
	}  
	  
	public void setOther(String oth) {  
	    this.other = oth;  
	}
	
	public String getEmail() {  
	    return emailId;  
	}  
	  
	public void setEmail(String email) {  
	    this.emailId = email;  
	}
	
	public String getPwd() {  
	    return pwd;  
	}  
	  
	public void setPwd(String pass) {  
	    this.pwd = pass;  
	}
}
