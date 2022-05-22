package com.jdbcConnector;
import java.sql.*;

public class ConnectionProvider {
	private static Connection con=null;
	static {
		try {
			Class.forName(Provider.JDBC_DRIVER);
			con=DriverManager.getConnection(Provider.DB_URL, Provider.user, Provider.pwd);  
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException sql) {
			sql.printStackTrace();
		}  
	}
	
	public static Connection getCon() {
		return con;
	}
}
