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

import sirdarey.entity.Post;
import sirdarey.entity.Posts;
import sirdarey.service.PostsService;

@RestController
@RequestMapping("/posts")
public class PostsController {
	
	@Autowired
	PostsService postsService; 
	
	@GetMapping
	public Posts getPosts () {
		return postsService.getPosts();
	}
	
	@GetMapping("/{id}")
	public Post getPost (@PathVariable int id) {
		return postsService.getPost(id);
	}
	
	@GetMapping("/adminPosts/{adminId}")
	public Posts getPostsByAdmin (@PathVariable int adminId) {
		return postsService.getPostsByAdmin(adminId);
	}
	
	@PostMapping()
	public void addPost (@RequestBody Post newPost) {
		postsService.addPost(newPost);
	}
	
	@PutMapping("/{id}")
	public void updatePost (@RequestBody Post updatedPost, @PathVariable int id) {
		postsService.updatePost(updatedPost, id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePost (@PathVariable int id) {
		postsService.deletePost(id);
	}
}
