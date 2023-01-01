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

import sirdarey.entity.Brand;
import sirdarey.entity.Brands;
import sirdarey.services.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {
	
	@Autowired
	BrandService brandService;
	
	@GetMapping
	public Brands getBrands() {
		return brandService.getBrands();
	}
	
	@GetMapping("/{brandId}")
	public Brand getBrand(@PathVariable int brandId) {
		return brandService.getBrand(brandId);
	}
	
	@PostMapping
	public Brand addBrand(@RequestBody Brand newBrand) {
		return brandService.addBrand(newBrand);
	}
	
	@PutMapping("/{brandId}")
	public Brand updatedBrand(@PathVariable int brandId, @RequestBody Brand updatedBrand) {
		return brandService.updateBrand(brandId, updatedBrand);
	}
	
	@DeleteMapping("/{brandId}")
	public void deleteBrand(@PathVariable int brandId) {
		brandService.deleteBrand(brandId);
	}
}
