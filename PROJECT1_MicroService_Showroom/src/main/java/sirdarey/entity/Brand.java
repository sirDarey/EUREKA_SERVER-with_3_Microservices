package sirdarey.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer brandid;
	private String brandname;
	
	@OneToMany(cascade = CascadeType.ALL)  //unidirectional
	@JoinColumn(name="brandid", referencedColumnName = "brandid")   //unidirectional
	private List<Product> productslist;
	
	
	public Brand() {}

	public Integer getBrandid() {
		return brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public List<Product> getProductslist() {
		return productslist;
	}

	public void setProductslist(List<Product> productslist) {
		this.productslist = productslist;
	}
}
