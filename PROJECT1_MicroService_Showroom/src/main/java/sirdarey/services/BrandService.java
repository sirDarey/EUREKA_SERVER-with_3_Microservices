package sirdarey.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sirdarey.entity.Brand;
import sirdarey.entity.Brands;
import sirdarey.repo.BrandRepo;

@Service
public class BrandService {
	
	@Autowired
	BrandRepo brandRepo;
	
	public Brands getBrands () {
		List <Brand> brandsList = new ArrayList<>();
		for (Brand brand : brandRepo.findAll()) 		
			brandsList.add(brand);	
		return new Brands(brandsList);
	}

	public Brand getBrand(int brandId) {
		return brandRepo.findById(brandId).get();
	}

	public Brand addBrand(Brand newBrand) {
		return brandRepo.save(newBrand);
	}

	public Brand updateBrand(int brandId, Brand updatedBrand) {
		Brand getBrand = brandRepo.findById(brandId).get();
		getBrand.setBrandname(updatedBrand.getBrandname());
		return brandRepo.save(getBrand);
	}

	public void deleteBrand(int brandId) {
		brandRepo.deleteById(brandId);
	}
	
}
