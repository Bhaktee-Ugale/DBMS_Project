package com.vaccine_booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbcConnector.ConnectionProvider;

public class VaccineBooking {
	
	public static boolean isBooked(String adhno) {
		boolean is=false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select isBooked(?);");
			ps.setString(1, adhno);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				if(rs.getInt(1)==1) is=true;
			}
			
			con.close();
		}
		catch(SQLException e) {}
		return is;
	}
	
	public static boolean bookVaccine(String adhno) {
		boolean status = isBooked(adhno);
		if(status) return false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement p = con.prepareStatement("select MobNo from personal_det where Adhno=?");
			p.setString(1, adhno);
			ResultSet rs=p.executeQuery();
			int bno;
			String ans;
			while(rs.next()) {
				ans = rs.getString(1);
				
			}
			p = con.prepareStatement("");
			p.execute();
			con.close();
		}
		catch(SQLException e) {}
		
		return status;
	}
}
