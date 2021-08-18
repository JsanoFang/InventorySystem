package InventorySystem;

import org.json.JSONObject;



public class Admin extends Account{

	public Admin(String name, String Address, String mail, String password, String Username, int id, int role) {
		super(name, Address, mail, password, Username, id, role);
	}
	
	public Admin(JSONObject userProfile) {
		super(userProfile);
	}
	
	protected String getUsername() {
		return super.Username;
	}
	protected void setUsername(String username) {
		super.Username = username;
	}
	protected String getPassword() {
		return super.Password;
	}
	protected void setPassword(String Password) {
		super.Password = Password;
	}
	protected String getName() {
		return super.name;
	}
	protected void setName(String Name) {
		super.name = Name;
	}
	protected String getMail() {
		return super.mail;
	}
	protected void setMail(String mail) {
		super.mail = mail;
	}
	protected int getRole() {
		return super.Role;
	}
	protected void setRole(int role) {
		super.Role = role;
	}
	protected String getAddress() {
		return super.address;
	}
	protected void setAddress(String address) {
		super.address = address;
	}
}
