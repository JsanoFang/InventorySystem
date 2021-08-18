package InventorySystem;

import org.json.JSONObject;

public class UserProfiler{
	public Object UserProfile(JSONObject userProfile) {
		int role = userProfile.getInt("AccessLevel");
		if (role > 1) {
			return new ProductManager(userProfile);
		}
		else {
			return new Admin(userProfile);
		}
	}
	
    public int getAccessRight(int role){
        return role;
    }
    
    public static void addProductMgr() {
    	//make user from userProfile or normal constructor
    }
    
    public static void modifyProductMgr() {
    	//removeUser
    }
    
    public static void addSupplier() {
    	//manageSupplier
    }
    
    public static void modifySupplier() {
    	//manageSupplier
    }
    
    public static void setStatusSupplier() {
    	//manageSupplier
    }
    
   
    
    //
    
}
