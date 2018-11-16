package com.pgbook;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class SignupJdbc {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int i; // It is used to take the return value of method that saves the data in database.
	/**
	 * This method creates a connection with Oracle database using thin driver
	 * @return the object of connection.
	 */
	public Connection myConnection(){
		//1.load driver
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Newuser123");
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
	/**
	 * This method is used for Storing data in database
	 * @param al is the collection object that contains object of signUp class.
	 * @return It species weather the data is saved or not.
	 */
	public int saveData(ArrayList<Signup> al){
		try {
			Iterator it = al.iterator();
			while(it.hasNext()) 
			{
			 Signup su =(Signup)it.next();
			con=myConnection();
			ps=con.prepareStatement("insert into Registration1 values(?,?,?)");
			ps.setString(1,su.getEmail());
			ps.setString(2,su.getUname());
			ps.setString(3,su.getPassword());
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
	/**
	 * It displays all the records present in our database.
	 * @return collection of type array list.
	 */
	public ArrayList<Signup> display()
	{     
		ArrayList<Signup> lst=new ArrayList<Signup>();
		con=myConnection();
		try
		{
		Statement s=con.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			rs=s.executeQuery("select * from Registration1");
			while(rs.next())
			{
				Signup a=new Signup();
				a.setEmail(rs.getString(1));
				a.setUname(rs.getString(2));
				a.setPassword(rs.getString(3));
				lst.add(a);
				System.out.println("cnt");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lst;
		
	}	
	
	public boolean checkMember(LoginData lo) 
	 {
		System.out.println(lo.getName());
		System.out.println(lo.getPass());
		myConnection();
	    ArrayList<Signup> lst=display();
		boolean b=false;
		for(Signup r:lst)
		{
			System.out.println(r.getEmail());
			System.out.println(r.getUname());
			System.out.println(r.getPassword());
			if(Objects.equals(r.getUname(), lo.getName()))
			{
				if(Objects.equals(r.getPassword(), lo.getPass()))
				{
					b=true;
					break;
				}
			}
		}
		return b;
		

     }
}
