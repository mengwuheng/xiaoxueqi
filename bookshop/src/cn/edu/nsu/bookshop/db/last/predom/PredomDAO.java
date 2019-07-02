package cn.edu.nsu.bookshop.db.last.predom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;


public class PredomDAO extends DBMain<Predom>{

	public ArrayList<Predom> getAll() throws ClassNotFoundException, SQLException {
		
		String sql = "select * from predom";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Predom> predom = new ArrayList<Predom>();
		while(rst.next()) {
			predom.add(assemble(rst));
		}
		return predom;
		
	}
	
	public Predom getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from predom where predoms_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Predom predom = null;
		while(rst.next()) {
			 predom = assemble(rst);
		 }
		 return predom;
	}
	
	public void add(Predom dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into predom(predoms_id,functions_id,roles_id) VALUES(?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getPredoms_id());
		pst.setInt(1,dataObj.getFunctions_id());
		pst.setInt(1,dataObj.getRoles_id());
	    pst.executeUpdate();
	
	}
	
	public void modify(Predom newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update predom set predoms_id=?,functions_id=?,roles_id=? where predoms_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getPredoms_id());
		pst.setInt(2,newDataObj.getFunctions_id());
		pst.setInt(10,newDataObj.getRoles_id());
		pst.setInt(1,newDataObj.getPredoms_id());
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM predom WHERE predoms_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Predom assemble(ResultSet rst) throws SQLException {

		Predom predom = new Predom();
		predom.setPredoms_id(rst.getInt("predoms_id"));
		predom.setFunctions_id(rst.getInt("functions_id"));
		predom.setRoles_id(rst.getInt("roles_id"));
		
		return predom;
	
	}
	
	
}

