package InventorySystem;

public class ProductItems {
	private String Name,Brand,Description,Supplier,IMGPath;
	private int Quantity, ID;
	private double Price;
	public ProductItems (String name, String brand, String description, double price, int quantity, int id, String imgPath, String Supplier) {
		this.Brand = brand;
		this.Name = name;
		this.ID = id;
		this.Description = description;
		this.IMGPath = imgPath;
		this.Price = price;
		this.Quantity = quantity;
		this.Supplier = Supplier;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getSupplier() {
		return Supplier;
	}
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}
	public String getIMGPath() {
		return IMGPath;
	}
	public void setIMGPath(String iMGPath) {
		IMGPath = iMGPath;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
}
