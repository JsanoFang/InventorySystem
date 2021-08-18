package InventorySystem;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class UserProfiler{
	static List<Admin> adminlist = new ArrayList<Admin>();
	static List<ProductManager> pmlist = new ArrayList<ProductManager>();
	
	public Object UserProfile(JSONObject userProfile) {
		int role = userProfile.getInt("AccessLevel");
		if (role > 1) {
			return new ProductManager(userProfile);
		}
		else {
			return new Admin(userProfile);
		}
	}
	
	public static void readProfiles() {
		final String fileName = "C:\\Users\\franki\\Documents\\InventorySystem\\profile.json";
		JSONObject profiles = JSONManager.getJsonObjectFile(fileName); //take json object
		String[] names = JSONObject.getNames(profiles);
		for (String name : names) {
			JSONObject reference = profiles.getJSONObject(name);
			if (reference.getInt("AccessLevel")== 0) {
				Admin a = new Admin(reference);
				adminlist.add(a);
			}else if(reference.getInt("AccessLevel")== 0){
				ProductManager pm = new ProductManager(reference);
				pmlist.add(pm);
			}	
		}
	}
	
    public int getAccessRight(int role){
        return role;
    }
    
    public static void addProductMgr() {
    	
    }
    
    public static void modifyProductMgr() {
    	//removeUser
    }
    
    public static void setProfileStatus() {
    	//manageSupplier
    }
    
   
    
    //
    
}
