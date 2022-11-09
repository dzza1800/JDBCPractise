package com.qa.project.finance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Users  {
	//running database connection plus global variables
	DBConfig db = new DBConfig();
    Connection conn = db.connect();
    List<String> list;
    
    public String AddUser(UserEntity user) {
    	try {
    		PreparedStatement statement = conn.prepareStatement("INSERT INTO Users (Username, Password) VALUES (?, ?);");
    		statement.setString(1, user.getUsername());
    		statement.setString(2, user.getPassword());
    		
    		statement.executeUpdate();
    		
    		return user.toString();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		System.err.println("Error creating user");
    		return user.toString();
    	}
    }
    
    public void UpdateUser(UserEntity user) {
    	try {
    		PreparedStatement statement = conn.prepareStatement("UPDATE Users SET Username = ?, Password = ? WHERE User_ID = ?;");
    		statement.setString(1, user.getUsername());
    		statement.setString(2, user.getPassword());
    		statement.setInt(3, user.getId());
    		
    		statement.executeUpdate();
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.err.println("Error updating user");
    	}
    }
    
    public boolean DeleteUser(int id) {
    	try {
    		PreparedStatement statement = conn.prepareStatement("DELETE FROM Users WHERE User_ID = ?");
    		statement.setInt(1, id);	
    		statement.executeUpdate();
    		
    		return true;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.err.println("Error updating user");
    		return false;
    	}
    }
    
    public List<String> getUsers() {
    	try {
    		Statement stmt = conn.createStatement();
    		list = new ArrayList<String>();
    		ResultSet set = stmt.executeQuery("SELECT * FROM Users");
    		while(set.next()) {
    			int id = set.getInt(1);
    			String username = set.getString(2);
    			String password = set.getString(3);
    			
    			UserEntity user = new UserEntity(id, username, password);
    			
    			list.add(user.toString());
    			
    		}
    		return list;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.err.println("Error getting users");
    		return list;
    	}
    }
}
