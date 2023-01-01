package sirdarey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sirdarey.entity.Product;
import sirdarey.services.ProductService;

@RestController
@RequestMapping("/brands/{brandId}")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/{productId}")
	public Product getProductByBrandIdAndProductId(@PathVariable int brandId, @PathVariable int productId) {
		return productService.getProductByBrandIdAndProductId(brandId, productId);
	}
	
	@PostMapping 
	public Product addProduct (@PathVariable int brandId, @RequestBody Product newProduct) {
		return productService.addProduct(brandId, newProduct);
	}
	
	@PutMapping("/{productId}")
	public Product updateProduct (@PathVariable int productId, @RequestBody Product updatedProduct) {
		return productService.updateProduct(productId, updatedProduct);
	}
	
	@DeleteMapping("/{productId}")
	public void deleteProduct (@PathVariable int productId) {
		productService.deleteProduct(productId);
	}
}
