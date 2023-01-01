package sirdarey.entity;

import java.util.ArrayList;
import java.util.List;

public class Posts {
	List<Post> postList = new ArrayList<>();
	
	public Posts () {}

	public Posts(List<Post> postList) {
		this.postList = postList;
	}

	public List<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
}
