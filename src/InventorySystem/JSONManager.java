package InventorySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.*;
import org.json.JSONObject;

public class JSONManager {

	public static String getJsonString(String fileName) {
		try {
			Scanner getJson;
			InputStream in = FileHandler.readFromFile(fileName);
			getJson = new Scanner(in);
			String jsonToString = getJson.useDelimiter("\\Z").next();//ignore usedelimiter("\\Z")
			getJson.close();
			return jsonToString;
		}
		catch (Exception fi) {
			System.out.println("Error. File not found.");
		}
		return null;
	}

	public static JSONObject getJsonObjectFile(String fileName) {
		return new JSONObject (getJsonString(fileName)); // provides JSONObject from getJsonString
	}
	
	public static List<String> UserValidator(JSONObject profiles, String user, String pass){
		String[] names = JSONObject.getNames(profiles);
		for (String profile : names) {
			if(profile.compareTo(user) == 0) {
				JSONObject userprofile = profiles.getJSONObject(profile);
				List<String> userProfile = new ArrayList<String>();
				userProfile.add(userprofile.getString("Password"));
				if (userProfile.get(0).equals(pass)){
					userProfile.add(userprofile.getString("Name"));
					userProfile.add("" + userprofile.getInt("ID"));
					userProfile.add(userprofile.getString("Email"));
					userProfile.add(userprofile.getString("Address"));
					userProfile.add(userprofile.getString("Username"));
					userProfile.add("" + userprofile.getInt("AccessLevel"));
					return userProfile;
				}
				else {
					System.out.println("Wrong username and password");
					userProfile.remove(0);
					return null ;
				}
			}
		}
		return null;	
	}
	
	public static JSONObject readProfiles() {
		final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\profile.json";
		JSONObject profiles = getJsonObjectFile(fileName); //take json object
		return profiles;
	}
	
	public static JSONObject readProducts() {
	    final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\products.json";
		JSONObject products = getJsonObjectFile(fileName);//take json object
		return products;
		}
	
	public static String writeUserJSONObject(List<String> listdata) {
		final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\profile.json";
		OutputStreamWriter wr = FileHandler.writeToFile(fileName);
		wr.write(listdata);
		wr.close();
	}
	public static String writeProductJSONObject(List<String> listdata) {
		final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\Json.json";
		OutputStreamWriter wr = FileHandler.writeToFile(fileName);
		wr.close();
	}
	
	public static void logChanges() {
		//find a way to log
	}
}

/*

public static JSONObject UserValidator(JSONObject profiles, String user, String pass){
	String[] names = JSONObject.getNames(profiles);
	for (String profile : names) {
		if(profile.compareTo(user) == 0) {
			JSONObject userProfile = profiles.getJSONObject(profile);
			if (userProfile.get("Password").equals(pass)){	
				return userProfile;
			}
			else {
				System.out.println("Wrong username and password");
				return null ;
			}
		}
	}
	return null;	
}
*/