package com.vaccine_booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbcConnector.ConnectionProvider;

public class VaccineBooking {
	
	private static boolean isBooked(String adhno) {
		boolean is=false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select isBooked(?);");
			ps.setString(1, adhno);
			ResultSet rs=ps.executeQuery();
			is=rs.next();
			con.close();
			
		}
		catch(Exception e) {}
		return is;
	}
}
/*
 * create function isBooked(adhno String)
 * returns int
 * begin
 * declare is_b int default 0;
 * declare bno int default -1;
 * set bno = select bno from PersonalDet where adhno=adhno;
 * if bno!=-1 then
 * set is_b=1;
 * end if;
 * return is_b;
 * end//
 *
 */
