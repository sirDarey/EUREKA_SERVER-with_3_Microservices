package sirdarey.entity;

import java.util.List;

public class Brands {
	List<Brand> brandsList;
	
	public Brands () {}

	public Brands(List<Brand> brandsList) {
		this.brandsList = brandsList;
	}

	public List<Brand> getBrandsList() {
		return brandsList;
	}

	public void setBrandsList(List<Brand> brandsList) {
		this.brandsList = brandsList;
	}	
}
