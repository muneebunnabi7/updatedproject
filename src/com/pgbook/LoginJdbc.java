package com.pgbook;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class LoginJdbc {
	Connection con;
	PreparedStatement ps;
	int i;
	public Connection myConnection(){
		//1.load driver
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Newuser123");
			System.out.println("Connection to db..");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("catch connection..");
		} catch (SQLException e) {
			System.out.println("catch connection..2");
			e.printStackTrace();
		}
		return con;
	}
	public int enterData(ArrayList<LoginData> ls){
		try { 
			
			Iterator it = ls.iterator();
			while(it.hasNext()) 
			{
			 LoginData su =(LoginData)it.next();
			 con=myConnection();
			ps=con.prepareStatement("insert into Log values(?,?)");
			ps.setString(1,su.getName());
			ps.setString(2,su.getPass());
			i = ps.executeUpdate();
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("test11");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("global.."+e);
		}
		return i;
	}

}

