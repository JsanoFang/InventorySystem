package InventorySystem;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class LoginForm {

	public static void main(String[] args) {
		List<String> userProfile = new ArrayList<String>();
		userProfile.add("Name");
		userProfile.add("ID");
		userProfile.add("Email");
		userProfile.add("Address");
		userProfile.add("Username");
		userProfile.add("Password");
		userProfile.add("AccessLevel");
		System.out.println(userProfile.get(5));
		/*
		JSONObject profiles = JSONManager.getJsonObjectFile("\\profile.json");
		String user = JOptionPane.showInputDialog("Enter user:");
		String pass = JOptionPane.showInputDialog("Enter pass:");
		JSONObject userProfile = JSONManager.UserValidator(profiles, user, pass);
		UserProfiler userProf = new UserProfiler(userProfile);
		UserProfiler.createUserProfile(userProfile); 
		System.out.println(userProf.toString());
		*/

	}

}
