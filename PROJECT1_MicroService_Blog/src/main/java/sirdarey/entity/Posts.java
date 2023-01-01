package sirdarey.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Posts {
	Collection<Post> postList = new ArrayList<>();
	
	public Posts () {}

	public Posts(Collection<Post> collection) {
		this.postList = collection;
	}

	public Collection<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
}
