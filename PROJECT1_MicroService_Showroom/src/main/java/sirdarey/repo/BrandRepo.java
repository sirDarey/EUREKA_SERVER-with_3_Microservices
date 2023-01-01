package sirdarey.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sirdarey.entity.Brand;

@Repository
public interface BrandRepo extends CrudRepository<Brand, Integer>{

}
