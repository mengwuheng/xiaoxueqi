package cn.edu.nsu.bookshop.db.last.comments;

public class Comments {
	private int comments_id;
	private int users_id;
	private int books_id;
	private String comments_content;
	private String comments_time;
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(comments_id+"\t").append(users_id+"\t").append(books_id+"\t")
		.append(comments_content+"\t").append(comments_time+"\t");
		return sb.toString();
	}

	public int getComments_id() {
		return comments_id;
	}

	public void setComments_id(int comments_id) {
		this.comments_id = comments_id;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

	public int getBooks_id() {
		return books_id;
	}

	public void setBooks_id(int books_id) {
		this.books_id = books_id;
	}

	public String getComments_content() {
		return comments_content;
	}

	public void setComments_content(String comments_content) {
		this.comments_content = comments_content;
	}

	public String getComments_time() {
		return comments_time;
	}

	public void setComments_time(String comments_time) {
		this.comments_time = comments_time;
	}
	
	
	
}
