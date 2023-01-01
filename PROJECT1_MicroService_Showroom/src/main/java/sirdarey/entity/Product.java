package sirdarey.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@SuppressWarnings("unused")
	private Integer brandid;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productid;
	private String productname;
	private String category;
	private Integer cost;
	
	public Product() {}	

	public Product(Integer brandid, String productname, String category, Integer cost) {
		this.brandid = brandid;
		this.productname = productname;
		this.category = category;
		this.cost = cost;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getProductid() {
		return productid;
	}

}
