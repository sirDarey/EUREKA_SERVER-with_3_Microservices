package sirdarey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import sirdarey.entity.Post;
import sirdarey.entity.Posts;
import sirdarey.repository.PostsRepository;

@Service
public class PostsService {
	
	@Autowired
	private PostsRepository postsRepository;

	public Posts getPosts() {
		List<Post> postsList = new ArrayList<>();
		for (Post post : postsRepository.findAll(Sort.by(Sort.Direction.DESC, "genre")))
			postsList.add(post);
		return new Posts(postsList);
	}

	public Post getPost(int id) {
		return postsRepository.findById(id).get();
	}

	public void addPost(Post newPost) {
		postsRepository.save(newPost);
	}

	public void updatePost(Post updatedPost, int id) {
		Post temp = postsRepository.findById(id).get();
		temp.setTitle(updatedPost.getTitle());
		temp.setBody(updatedPost.getBody());
		temp.setGenre(updatedPost.getGenre());
		postsRepository.save(temp);			
	}
	
	public void deletePost(int id) {
		postsRepository.deleteById(id);			
	}

	public Posts getPostsByAdmin(int adminId) {
		return new Posts(postsRepository.findAllByPostedby(adminId));
	}
}
