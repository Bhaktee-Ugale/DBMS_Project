package com.vaccine_booking;

public class CenterInfo {
	private String cntrcde, name, ts1, ts2;
	private int cs_amt, cv_amt;
	
	public String getCntcrde() {
		return cntrcde;
	}
	
	public void setCntcrde(String cntrcde) {
		this.cntrcde=cntrcde;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getTs1() {
		return ts1;
	}
	
	public void setTs1(String ts1) {
		this.ts1=ts1;
	}
	
	public String getTs2() {
		return ts2;
	}
	
	public void setTs2(String ts2) {
		this.ts2=ts2;
	}
	
	public int getCs_amt() {
		return cs_amt;
	}
	
	public void setCs_amt(int cs_amt) {
		this.cs_amt = cs_amt;
	}
	
	public int getCv_amt() {
		return cv_amt;
	}
	
	public void setCv_amt(int cv_amt) {
		this.cv_amt = cv_amt;
	}
}
