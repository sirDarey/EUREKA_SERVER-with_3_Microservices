package sirdarey.entity;

import java.util.List;

public class Products {
	List<Product> productsList;
	
	public Products() {}

	public Products(List<Product> productsList) {
		this.productsList = productsList;
	}

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}
}
