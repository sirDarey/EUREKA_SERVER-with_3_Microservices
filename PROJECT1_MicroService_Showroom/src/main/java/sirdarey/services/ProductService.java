package sirdarey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sirdarey.entity.Product;
import sirdarey.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	public Product getProductByBrandIdAndProductId(int brandId, int productId) {
		return productRepo.getProductByBrandIdAndProductId(brandId, productId);
	}

	public Product addProduct(int brandId, Product newProduct) {
		Product temp = new Product(brandId, 
								newProduct.getProductname(), 
								newProduct.getCategory(), 
								newProduct.getCost());
		
		return productRepo.save(temp);
	}

	public Product updateProduct(int productId, Product updatedProduct) {
		Product temp = productRepo.findById(productId).get();
		temp.setCategory(updatedProduct.getCategory());
		temp.setCost(updatedProduct.getCost());
		temp.setProductname(updatedProduct.getProductname());

		return productRepo.save(temp);
	}

	public void deleteProduct(int productId) {
		productRepo.deleteById(productId);
	}

}
