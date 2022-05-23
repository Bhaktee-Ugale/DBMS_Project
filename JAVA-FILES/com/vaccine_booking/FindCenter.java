package com.vaccine_booking;

import java.util.List;
import com.jdbcConnector.ConnectionProvider;
import java.util.LinkedList;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FindCenter {
	public static List<CenterInfo> findCenter(String cntr, String pin) {
		List<CenterInfo> cs = new LinkedList<CenterInfo>();
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select cntr, name, ts1, ts2, cs_amt, cv_amt from CenterDet where cntr=? and pin=? and cs_amt>0 and cv_amt>0");
			ps.setString(1, cntr);
			ps.setString(2, pin);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CenterInfo tmp = new CenterInfo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
				cs.add(tmp);
			}
			con.close();
		}
		catch(SQLException e) {}
		
		return cs;
	}
}
