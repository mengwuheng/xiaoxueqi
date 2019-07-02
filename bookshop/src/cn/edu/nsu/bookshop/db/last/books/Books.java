package cn.edu.nsu.bookshop.db.last.books;

public class Books {
	private int books_id;
	private int bookTypes_id;
	private String books_ISBN;
	private String books_name;
	private String books_author;
	private String books_publisher;
	private float books_price;
	private String books_note;
	private String books_faceImg;
	private String books_inDate;

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(books_id+"\t").append(bookTypes_id+"\t").append(books_ISBN+"\t")
		.append(books_name+"\t").append(books_author+"\t").append(books_publisher+"\t")
		.append(books_price+"\t").append(books_note+"\t").append(books_faceImg+"\t")
		.append(books_inDate+"\t");
		
		return sb.toString();
	}

	public int getBooks_id() {
		return books_id;
	}

	public void setBooks_id(int books_id) {
		this.books_id = books_id;
	}

	public int getBookTypes_id() {
		return bookTypes_id;
	}

	public void setBookTypes_id(int bookTypes_id) {
		this.bookTypes_id = bookTypes_id;
	}

	public String getBooks_ISBN() {
		return books_ISBN;
	}

	public void setBooks_ISBN(String books_ISBN) {
		this.books_ISBN = books_ISBN;
	}

	public String getBooks_name() {
		return books_name;
	}

	public void setBooks_name(String books_name) {
		this.books_name = books_name;
	}

	public String getBooks_author() {
		return books_author;
	}

	public void setBooks_author(String books_author) {
		this.books_author = books_author;
	}

	public String getBooks_publisher() {
		return books_publisher;
	}

	public void setBooks_publisher(String books_publisher) {
		this.books_publisher = books_publisher;
	}

	public float getBooks_price() {
		return books_price;
	}

	public void setBooks_price(float books_price) {
		this.books_price = books_price;
	}

	public String getBooks_note() {
		return books_note;
	}

	public void setBooks_note(String books_note) {
		this.books_note = books_note;
	}

	public String getBooks_faceImg() {
		return books_faceImg;
	}

	public void setBooks_faceImg(String books_faceImg) {
		this.books_faceImg = books_faceImg;
	}

	public String getBooks_inDate() {
		return books_inDate;
	}

	public void setBooks_inDate(String books_inDate) {
		this.books_inDate = books_inDate;
	}

	
	
	
}
