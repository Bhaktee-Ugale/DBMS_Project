package com.vaccine_Registration;

import java.sql.*;

import com.jdbcConnector.ConnectionProvider;

public class VaccineRegistration{
	
	public static boolean register(Applicant a) {
		// TODO Auto-generated method stub
		int isDone=0;
		if(a.getPreg().equals("Y") || a.getDia().equals("Y")) return false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("insert into PersonalDet values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, a.getAdhno());
			
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
