package com.mart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Member implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2375915613671972807L;
	public static final String FILE = "D:\\Proj\\member.txt";

	
	private Map<String, User> userList = new LinkedHashMap<String, User>();
	
	public Member() {
		userList.put("admin", new User("Admin",
				Role.ROLE_ADMIN, "", new Long("9999999999"), "admin@mystore.com"));
		userList.put("manager", new User("Store Manager",
				Role.ROLE_MANAGER, "", new Long("8888888888"), "manager@mystore.com"));
		userList.put("user", new User("User",
				Role.ROLE_MEMBER, "", new Long("7777777777"), "user@mystore.com"));
	}
	
	public Map<String, User> getMembers() {
				
		return userList;
	}
	
	public void addMembers(List<User> users) {
		
		users.forEach(u -> userList.put(u.getUsername(), u));
	}
	
	public void addMember(User user) {
		
		userList.put(user.getUsername(), user);
	}
	
	public void updateMemberDetails(User user) {
		
		userList.put(user.getUsername(), user);
	}
	
	public void deleteMember(User user) {
		
		userList.remove(user.getUsername());
	}
	
	public void saveMemberObject() throws IOException {
		File file = new File(FILE);
		FileOutputStream stream = new FileOutputStream(file);
		ObjectOutputStream memberOS = new ObjectOutputStream(stream);
		memberOS.writeObject(this);
		memberOS.flush();
	}
	
	public static Member getMemberObject() throws IOException, ClassNotFoundException {
		File file = new File(FILE);
		FileInputStream stream = new FileInputStream(file);
		ObjectInputStream memberIS = new ObjectInputStream(stream);
		return (Member) memberIS.readObject();		
	}
	

}
