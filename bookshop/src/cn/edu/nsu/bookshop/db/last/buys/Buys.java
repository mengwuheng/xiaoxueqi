package cn.edu.nsu.bookshop.db.last.buys;

public class Buys {
	private int buys_id;
	private int books_id;
	private int users_id;
	private int buys_num;
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(buys_id+"\t").append(books_id+"\t").append(users_id+"\t")
		.append(buys_num+"\t");
		return sb.toString();
	}

	public int getBuys_id() {
		return buys_id;
	}

	public void setBuys_id(int buys_id) {
		this.buys_id = buys_id;
	}

	public int getBooks_id() {
		return books_id;
	}

	public void setBooks_id(int books_id) {
		this.books_id = books_id;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

	public int getBuys_num() {
		return buys_num;
	}

	public void setBuys_num(int buys_num) {
		this.buys_num = buys_num;
	}
	
	
}
