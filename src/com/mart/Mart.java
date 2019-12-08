package com.mart;

import java.io.IOException;
import java.util.Scanner;

public class Mart {
	
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		try {
			char ans = 'y';

			while(ans=='y'||ans=='Y') {
				System.out.println("***---WELCOME TO NRJ MART---***\n\n");
				System.out.println("Enter '1' to Login");
				System.out.println("Enter '2' to SignUp.");
				System.out.println("Enter '9' to Exit.");

				System.out.println("\nEnter Your Choice : ");
				int choice = input.nextInt();

				switch (choice) {
					case 1: login();
					break;

					case 2: signUp();
					break;

					case 9: System.out.println("Good Buy");
						System.exit(0);
					break;

					default: System.out.println("Feature Not Available");
					break;
				}

				System.out.println("Press 'y' to Continue, 'n' to Exit...");
				
				ans = input.next().toCharArray()[0];
			}

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private static boolean signUp() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = in.next();
		
		System.out.println("Enter Email : ");
		String email = in.next();
		
		System.out.println("Enter PhoneNumber : ");
		Long phoneNumber = in.nextLong();
		
		String username = email.split("@")[0];
		
		User user = new User(name, Role.ROLE_MEMBER, username, phoneNumber, email);
		
		Member m = new Member();
		
		User existingUser = getLoggedInMember(username);
		
		if(null!=existingUser) {
			System.out.println(username + " already exist. Please login...!!");
			return false;
		}
		
		m.addMember(user);
		
		try {
			System.out.println("Enter PhoneNumber : ");
			m.saveMemberObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	private static void login() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = in.next();
		
		User user = getLoggedInMember(username);
		
		System.out.println("Welcome " + user.getName()); 
		
				
	}
	
	private static User getLoggedInMember(String username) {
		Member member = null;
		try {
			member = Member.getMemberObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return (null!=member.getMembers().get(username))?member.getMembers().get(username):null;

	}
	
}
