package InventorySystem	;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.IntFunction;

public class ProductCatalougeManager {
	List<ProductItems> allproducts = new ArrayList<ProductItems>(); 
	List<ProductItems> CatalougeProducts = new ArrayList<ProductItems>();
	List CatalougeDetails = new ArrayList<>();
	public void start(List<ProductItems> a) {
		//get items from file manager
		if (!a.isEmpty()) {
		allproducts.addAll(a);
		}
		
	}
	public List<ProductItems> displayallproducts() {
		if(!allproducts.isEmpty()) {
			return allproducts;
		}
		else {
		return null;
		}
		//display all items
	}
	public List<ProductItems> DisplayProductsOfCatalouge(ProductCatalouge cat){
		
		return null;
	}
	public void add(ProductItems pro) {
		//add selected product items into the CatalougeProducts list
		CatalougeProducts.add(pro);
	}
	public void CreateCatalouge(String title, String bannerPath,int reference, String desc,Date date, String creator) {
		//create/instantiate new ProductCatalouge Class object
		ProductCatalouge product = new ProductCatalouge(title, bannerPath,reference, desc, date, creator,CatalougeProducts);
	}
	public void DeleteCatalouge(ProductCatalouge cat) {
		//delete object
		cat = null;
		//call garbage collector
		System.gc();
	}
	public void DeleteProductItems (ProductCatalouge cat, ProductItems item) {
		//remove selected item of product items from catalouge list of product items
		cat.getList().remove(item);
	}
	public List SelectExistingCatalouge(ProductCatalouge cat) {
		
		//flush existing list of product items
		CatalougeProducts.clear();
		//copy productcatalouge's list of product items to catalougeproduct (empty) 
		CatalougeProducts.addAll(cat.getList());
		//copy/get attribute of the ProductCatalouge
		CatalougeDetails.add(cat.getTitle());
		CatalougeDetails.add(cat.getDesc());
		CatalougeDetails.add(cat.getCreator());
		CatalougeDetails.add(cat.getSeason());
		CatalougeDetails.add(cat.getDate());
		CatalougeDetails.add(cat.getReference());
		CatalougeDetails.add(cat.getBannerPath());
		return CatalougeDetails;
	}
	public void SaveAttributeChanged(ProductCatalouge cat) {
	}
}
