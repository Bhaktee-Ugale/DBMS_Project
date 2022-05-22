package com.vaccine_Registration;

public class Applicant {
	private String adhno;
	private String name, city, state, mobno, emailId,pwd;
	private String pregnancy, diabetes, other, gender, pncd, dob; // other = other illnesses
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
	
	public String getPncd() {  
	    return pncd;  
	}  
	  
	public void setPncd(String pncd) {  
	    this.pncd = pncd;  
	}
	
	public String getMobno() {  
	    return mobno;  
	}  
	  
	public void setMobno(String mob) {  
	    this.mobno = mob;  
	}
	
	public String getPregnancy() {  
	    return pregnancy;  
	}  
	  
	public void setPregnancy(String preg) {  
	    this.pregnancy = preg;  
	}
	
	public String getDiabetes() {  
	    return diabetes;  
	}  
	  
	public void setDiabetes(String dia) {  
	    this.diabetes = dia;  
	}
	
	public String getOther() {  
	    return other;  
	}  
	  
	public void setOther(String oth) {  
	    this.other = oth;  
	}
	
	public String getEmailId() {  
	    return emailId;  
	}  
	  
	public void setEmailId(String email) {  
	    this.emailId = email;  
	}
	
	public String getPwd() {  
	    return pwd;  
	}  
	  
	public void setPwd(String pass) {  
	    this.pwd = pass;  
	}
}
