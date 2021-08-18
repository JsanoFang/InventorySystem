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

	protected void getCatalouge() {}




	
	
}
