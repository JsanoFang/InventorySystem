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
	
	public static JSONObject UserValidator(JSONObject profiles, String user, String pass){
		String[] names = JSONObject.getNames(profiles);
		for (String profile : names) {
			if(profile.compareTo(user) == 0) {
				JSONObject userProfile = profiles.getJSONObject(profile);
				if (userProfile.getString("Password").equals(pass)){
					return userProfile;
				}
				else {
					System.out.println("Wrong username and password");
					return null;
				}
			}
		}
		return null;	
	}
	
	public static void writeUserJSONObject(List<Admin> adminlist, List<ProductManager> pmlist ) {
		final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\profile.json";
		List<Object> userObjList = new ArrayList<Object>();
		userObjList.addAll(adminlist);
		userObjList.addAll(pmlist);
		JSONObject savedProfObj = new JSONObject();
		for(Admin o : adminlist) {
			savedProfObj.put("AccessLevel",  o.getRole());
			savedProfObj.put("Password", o.getPassword());
			savedProfObj.put("Username", o.getUsername());
			savedProfObj.put("Address", o.getAddress());
			savedProfObj.put("Email", o.getMail());
			savedProfObj.put("ID", o.getId());
			savedProfObj.put("Name", o.getName());
			savedProfObj.put(savedProfObj.getString("Username"), savedProfObj);
		}
		for(ProductManager o : pmlist) {
			savedProfObj.put("AccessLevel",  o.getRole());
			savedProfObj.put("Password", o.getPassword());
			savedProfObj.put("Username", o.getUsername());
			savedProfObj.put("Address", o.getAddress());
			savedProfObj.put("Email", o.getMail());
			savedProfObj.put("ID", o.getId());
			savedProfObj.put("Name", o.getName());
			savedProfObj.put(savedProfObj.getString("Username"), savedProfObj);
			}
		OutputStreamWriter wr = FileHandler.writeToFile(fileName);
		try {
			wr.write(savedProfObj.toString(2));
			wr.close();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writeProductJSONObject(List<String> listdata) {
		final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\Json.json";
		
		try {
		OutputStreamWriter wr = FileHandler.writeToFile(fileName);
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void listArrayToJSONObject() {
		
		
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