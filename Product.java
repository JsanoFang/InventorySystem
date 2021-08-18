package InventorySystem;

public class Product {
	private String productId;
	private String productName;
	private String productImg;
	private String productBrand;
	private int productQuantity;
	private int productRetPrice;
	private String productDescription;
	//TODO: make product image
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductRetPrice() {
		return productRetPrice;
	}
	public void setProductRetPrice(int productRetPrice) {
		this.productRetPrice = productRetPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Product(String productId, String productName, String productImg, String productBrand, int productQuantity,
			int productRetPrice, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImg = productImg;
		this.productBrand = productBrand;
		this.productQuantity = productQuantity;
		this.productRetPrice = productRetPrice;
		this.productDescription = productDescription;
	}
	public Product(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	
}
