package cn.edu.nsu.bookshop.db.last.functions;

public class Functions {
	private int functions_id;
	private String functions_name;
	private String functions_URI;
	private String functions_note;
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(functions_id+"\t").append(functions_name+"\t").append(functions_URI+"\t").append(functions_note+"\t");
		return sb.toString();
	}

	public int getFunctions_id() {
		return functions_id;
	}

	public void setFunctions_id(int functions_id) {
		this.functions_id = functions_id;
	}

	public String getFunctions_name() {
		return functions_name;
	}

	public void setFunctions_name(String functions_name) {
		this.functions_name = functions_name;
	}

	public String getFunctions_URI() {
		return functions_URI;
	}

	public void setFunctions_URI(String functions_URI) {
		this.functions_URI = functions_URI;
	}

	public String getFunctions_note() {
		return functions_note;
	}

	public void setFunctions_note(String functions_note) {
		this.functions_note = functions_note;
	}
	
}

