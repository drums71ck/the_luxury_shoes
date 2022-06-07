package controllers;

import java.sql.*;

public class ConnectionBBDD {
	public static String getIP() {
		return IP;
	}

	public static void setIP(String iP) {
		IP = iP;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		ConnectionBBDD.user = user;
	}

	public static String getPswd() {
		return pswd;
	}

	public static void setPswd(String pswd) {
		ConnectionBBDD.pswd = pswd;
	}

	private static String IP = "192.168.1.38";
	private static String user = "marc";
	private static String  pswd = "marc";
	private static String usern;
	public static String getUsern() {
		return usern;
	}

	public static void setUsern(String usern) {
		ConnectionBBDD.usern = usern;
	}

	public static void main(String[] args) {
		try {
			
			 Connection conn = DriverManager.getConnection("jdbc:mysql://"+ IP +"/TheLuxuryShoes",user,pswd	);
			
			 Statement stats = conn.createStatement();
			 
			 ResultSet result = stats.executeQuery("SELECT * FROM Users");
			 
			 while (result.next()) {
				usern=result.getString("username");
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
