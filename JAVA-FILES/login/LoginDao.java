package com.login;
import java.sql.*;

import com.jdbcConnector.ConnectionProvider;

public class LoginDao {
	public static boolean validate(ApplicantLogin al) {
		boolean status = false;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("select * from PersonalDet where adhno=? and pwd=?");
			ps.setString(1, al.getAdhno());
			ps.setString(2, al.getPwd());
			ResultSet rs=ps.executeQuery();  
			status=rs.next();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
