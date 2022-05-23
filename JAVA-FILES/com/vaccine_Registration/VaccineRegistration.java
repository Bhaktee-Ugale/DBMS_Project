package com.vaccine_Registration;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;

import com.jdbcConnector.ConnectionProvider;

public class VaccineRegistration{
	
	public static boolean register(Applicant a) {
		// TODO Auto-generated method stub
		int isDone=0;
		if(a.getPregnancy().equals("Y") || a.getDiabetes().equals("Y")) return false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("insert into personal_det(Aadhar_No, Name, DOB, Gender, City, State, Pincode, MobNo, emailId, Pregnancy, Diabetes, Other_Ill, pwd) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, a.getAdhno()); //aadhar number
			ps.setString(2, a.getName());  //name
			ps.setString(4, a.getGender()); //gender
			java.sql.Date n_dob=Date.valueOf(a.getDob());
			ps.setDate(3, n_dob); //convert string to date
			ps.setString(5, a.getCity()); //city
			ps.setString(6, a.getState());
			int n_pncd = Integer.parseInt(a.getPncd());
			ps.setInt(7, n_pncd);  //pincode
			ps.setString(8, a.getMobno());
			ps.setString(9, a.getEmailId());
			ps.setString(10, a.getPregnancy());
			ps.setString(11, a.getDiabetes());
			ps.setString(12, a.getOther());
			ps.setString(13, a.getPwd());
			isDone = ps.executeUpdate();
			if(isDone>0) return true;
			con.close();
		}
		catch(SQLException sql) {
			sql.printStackTrace();
		}
		return false;
	}
}
