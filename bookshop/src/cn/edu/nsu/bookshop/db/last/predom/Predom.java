package cn.edu.nsu.bookshop.db.last.predom;

public class Predom {
	private int predoms_id;
	private int functions_id;
	private int roles_id;
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(predoms_id+"\t").append(functions_id+"\t").append(roles_id+"\t");
		return sb.toString();
	}

	public int getPredoms_id() {
		return predoms_id;
	}

	public void setPredoms_id(int predoms_id) {
		this.predoms_id = predoms_id;
	}

	public int getFunctions_id() {
		return functions_id;
	}

	public void setFunctions_id(int functions_id) {
		this.functions_id = functions_id;
	}

	public int getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}
	
	
}
