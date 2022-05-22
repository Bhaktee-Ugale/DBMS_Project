package com.vaccine_Registration;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.jdbcConnector.ConnectionProvider;

public class VaccineRegistration{
	
	public static boolean register(Applicant a) {
		// TODO Auto-generated method stub
		int isDone=0;
		if(a.getPregnancy().equals("Y") || a.getDiabetes().equals("Y")) return false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("insert into personal_det values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, a.getAdhno());
			ps.setString(2, a.getName());
			ps.setString(3, a.getGender());
			ps.setDate(4, null); //convert string to date
			ps.setString(5, a.getCity());
			ps.setString(6, a.getState());
			ps.setString(7, a.getPncd());
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
