package InventorySystem;

import org.json.JSONObject;

public abstract class Account {
	public String name;
	public String address;
	public String mail;
	public String Username;
	public String Password;
	public int id;
	public int Role;
	
	
	public Account (String name, String Address, String mail,  String password,String username,int id,int role){
		this.name=name;
		this.id = id;
		this.address = Address;
		this.mail=mail;
		this.Role=role;
		this.Username = username;
		this.Password = password;
	}
	
	public Account (JSONObject userProfile){
		this.name=userProfile.getString("Name");
		this.id = userProfile.getInt("ID");
		this.address = userProfile.getString("Address");
		this.mail=userProfile.getString("Email");
		this.Role=userProfile.getInt("AccessLevel");
		this.Username = userProfile.getString("Username");
		this.Password = userProfile.getString("Password");
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected String getMail() {
		return mail;
	}

	protected void setMail(String mail) {
		this.mail = mail;
	}

	protected String getUsername() {
		return Username;
	}

	protected void setUsername(String username) {
		Username = username;
	}

	protected String getPassword() {
		return Password;
	}

	protected void setPassword(String password) {
		Password = password;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected int getRole() {
		return Role;
	}

	protected void setRole(int role) {
		Role = role;
	}

	protected void getCatalouge() {}




	
	
}
