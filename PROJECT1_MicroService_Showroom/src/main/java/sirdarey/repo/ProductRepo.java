package sirdarey.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sirdarey.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	@Query(value = "SELECT * FROM product WHERE brandid=?1 AND productid=?2", nativeQuery = true)
	Product getProductByBrandIdAndProductId(int brandId, int productId);
}
