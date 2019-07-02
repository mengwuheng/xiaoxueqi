package cn.edu.nsu.bookshop.db.last.functions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;


public class FunctionsDAO extends DBMain<Functions>{
	public ArrayList<Functions> getAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from functions";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Functions> functions = new ArrayList<Functions>();
		while(rst.next()) {
			functions.add(assemble(rst));
		}
		return functions;
	}
    public Functions getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from functions where functions_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Functions functions = null;
		while(rst.next()) {
			functions = assemble(rst);
		 }
		 return functions;
	}
	
	public void add(Functions dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into functions(functions_id,functions_name,functions_URI,functions_note) VALUES(?,?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getFunctions_id());
		pst.setString(1,dataObj.getFunctions_name());
		pst.setString(1,dataObj.getFunctions_URI());
		pst.setString(1,dataObj.getFunctions_note());
	    pst.executeUpdate();
	
	}
	
	public void modify(Functions newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update functions set functions_id=?,functions_name=?,functions_URI=?,functions_note=? where functions_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getFunctions_id());
		pst.setString(1,newDataObj.getFunctions_name());
		pst.setString(2,newDataObj.getFunctions_URI());
		pst.setString(3,newDataObj.getFunctions_note());
		pst.setInt(1,newDataObj.getFunctions_id());
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM functions WHERE functions_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Functions assemble(ResultSet rst) throws SQLException {

		Functions functions = new Functions();
		functions.setFunctions_id(rst.getInt("functions_id"));
		functions.setFunctions_name(rst.getString("functions_name"));
		functions.setFunctions_URI(rst.getString("functions_URI"));
		functions.setFunctions_note(rst.getString("functions_note"));
		
		return functions;
	
	}
}
