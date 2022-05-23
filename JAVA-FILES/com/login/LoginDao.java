package com.login;
import java.sql.*;

import com.jdbcConnector.ConnectionProvider;

public class LoginDao {
	public static boolean validate(ApplicantLogin al) {
		boolean status = false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select Aadhar_No, pwd from personal_det where Aadhar_No=? and pwd=?");
			ps.setString(1, al.getAdhno());
			ps.setString(2, al.getPwd());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				if(al.getAdhno().equals(rs.getString(1)) && al.getPwd().equals(rs.getString(2))) status=true;
			}
			//con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
