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
import org.springframework.web.client.RestTemplate;

import sirdarey.entity.Post;
import sirdarey.entity.Posts;


@RestController
@RequestMapping("/admins/posts")
public class PostController {
	
	private final String postsURL = "http://BLOG/posts";
	private final String postURL = "http://BLOG/posts/{postId}";
	private final String myPostsURL = "http://BLOG/posts/adminPosts/{adminId}";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public Posts getAllPosts () {
		return restTemplate.getForObject(postsURL, Posts.class);
	}
	
	@GetMapping("/adminPosts/{adminId}")
	public Posts getMyPosts (@PathVariable int adminId) {
		return restTemplate.getForObject(myPostsURL, Posts.class, adminId);
	}
	
	@GetMapping("/{postId}")
	public Post getPostById (@PathVariable int postId) {
		return restTemplate.getForObject(postURL, Post.class, postId);
	}
	
	@PostMapping()
	public void addPost (@RequestBody Post newPost) {
		restTemplate.postForEntity(postsURL, newPost, Post.class);
	}
	
	@PutMapping("/{postId}")
	public void updatePost (@RequestBody Post updatedPost, @PathVariable int postId) {
		restTemplate.put(postURL, updatedPost, postId);
	}
	
	@DeleteMapping("/{postId}")
	public void deletePost (@PathVariable int postId) {
		restTemplate.delete(postURL, postId);
	}
}
