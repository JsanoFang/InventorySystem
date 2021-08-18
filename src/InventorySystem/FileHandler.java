package InventorySystem;

import java.io.*;

public class FileHandler {
	public static InputStream readFromFile(String fileName) {
		try {
			InputStream reader = new FileInputStream(new File (fileName));
			return reader;
		} catch (FileNotFoundException fi) {
			System.out.println("Error. File not found.");
		}
		return null;
	}
	
	public static OutputStreamWriter writeToFile(String fileName) {
		try {
			File file = new File("C:\\Users\\owner\\Desktop\\demo.txt");
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
			return writer;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
