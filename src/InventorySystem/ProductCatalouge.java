package InventorySystem;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.List;  
public class ProductCatalouge {
	
	private int reference;
	private String title,bannerPath,desc,creator;
	private Date date;
	private List<ProductItems> ListOfProducts;

	public ProductCatalouge (String title, String bannerPath,int reference, String desc,Date date, String creator, List<ProductItems> List) {
	 this.bannerPath = bannerPath;
	 this.date = date;
	 this.desc = desc;
	 this.reference= reference;
	 this.title = title;
	 this.creator = creator;
	 this.ListOfProducts = List;
	}
	
	public Date getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return date;
	}
	
	private static final String seasons[] = {
		    "Winter", "Winter",
		    "Spring", "Spring", "Spring",
		    "Summer", "Summer", "Summer",
		    "Fall", "Fall", "Fall",
		    "Winter"
		};
	public List<ProductItems> getList(){
		return ListOfProducts;
	}
	public void setList(List<ProductItems> pro) {
		this.ListOfProducts = pro;
	}
	
	public String getSeason() {
		return seasons[ date.getMonth() ];
	}
	public String getCreator() {
		return creator;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBannerPath() {
		return bannerPath;
	}

	public void setBannerPath(String bannerPath) {
		this.bannerPath = bannerPath;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	
	
}

