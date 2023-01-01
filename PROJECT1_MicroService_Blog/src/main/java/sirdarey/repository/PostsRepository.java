package sirdarey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sirdarey.entity.Post;

@Repository
public interface PostsRepository extends JpaRepository<Post, Integer> {
	
	@Query (value = "SELECT * FROM post WHERE postedby = ?1", nativeQuery = true)
	List <Post> findAllByPostedby(int postedby); 
}
