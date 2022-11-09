package com.qa.project.finance;


import java.util.Scanner;

public class Run {

	public Run() {
		Scanner scan = new Scanner(System.in);
	    //just scanner and input logic for a small menu 
	    System.out.println("Press 1 to add Users, Press 2 to update a User, 3 to view Users, 4 to delete a user by User_ID");
	    int choice = scan.nextInt();
	    while(choice != 0){ 
	    if(choice == 1) {

	    	System.out.println("Enter Username");
	    	String username = scan.next();
	    	System.out.println("Enter Password");
	    	String password = scan.next();
	    	System.out.println("Thank you");
	    	
	    	UserEntity user = new UserEntity(username, password);
	    	Users users = new Users();
	    	users.AddUser(user);
	    	
	    	System.out.println("Press 1 to add Users, Press 2 to update a User, 3 to view Users, 4 to delete a user by User_ID and 0 to exit");
		    choice = scan.nextInt();
	    }
	    if(choice == 2) {

	    	System.out.println("Enter ID");
	    	int id = scan.nextInt();
	    	System.out.println("Enter Username");
	    	String username = scan.next();
	    	System.out.println("Enter Password");
	    	String password = scan.next();
	    	System.out.println("Thank you");
	    	
	    	UserEntity user = new UserEntity(id, username, password);
	    	Users users = new Users();
	    	users.UpdateUser(user);
	    	
	    	System.out.println("Press 1 to add Users, Press 2 to update a User, 3 to view Users, 4 to delete a user by User_ID and 0 to exit");
		    choice = scan.nextInt();
	    }
	    if(choice == 3) {
	    	Users users = new Users();
	    	for(String user : users.getUsers()) {
	    		System.out.println(user);
	    	}
	    	
	    	System.out.println("Press 1 to add Users, Press 2 to update a User, 3 to view Users, 4 to delete a user by User_ID and 0 to exit");
		    choice = scan.nextInt();
	    }
	    
	    if(choice == 4) {
	    	Users users = new Users();
	    	System.out.println("Enter ID");
	    	int id = scan.nextInt();
	    	UserEntity user = new UserEntity();
	    	user.setId(id);
	    	users.DeleteUser(user.getId());
	    	
	    	System.out.println("Press 1 to add Users, Press 2 to update a User, 3 to view Users, 4 to delete a user by User_ID and 0 to exit");
		    choice = scan.nextInt();
	    	}
	    
	    
	   }
	   System.out.println("You Have exited, Goodbye!");
	    
	   scan.close(); 
	    }
}

