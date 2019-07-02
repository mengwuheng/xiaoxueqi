package cn.edu.nsu.bookshop.db.last.booktypes;

public class Booktypes {
	private int bookTypes_id;
	private String bookTypes_name;
	private String bookTypes_note;
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(bookTypes_id+"\t").append(bookTypes_name+"\t").append(bookTypes_note+"\t");
		return sb.toString();
	}

	public int getBookTypes_id() {
		return bookTypes_id;
	}

	public void setBookTypes_id(int bookTypes_id) {
		this.bookTypes_id = bookTypes_id;
	}

	public String getBookTypes_name() {
		return bookTypes_name;
	}

	public void setBookTypes_name(String bookTypes_name) {
		this.bookTypes_name = bookTypes_name;
	}

	public String getBookTypes_note() {
		return bookTypes_note;
	}

	public void setBookTypes_note(String bookTypes_note) {
		this.bookTypes_note = bookTypes_note;
	}
	
}
