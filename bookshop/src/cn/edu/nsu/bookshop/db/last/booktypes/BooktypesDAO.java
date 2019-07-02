package cn.edu.nsu.bookshop.db.last.booktypes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;


public class BooktypesDAO extends DBMain<Booktypes>{

	public ArrayList<Booktypes> getAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from booktypes";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Booktypes> booktypes = new ArrayList<Booktypes>();
		while(rst.next()) {
			booktypes.add(assemble(rst));
		}
		return booktypes;
	}
    public Booktypes getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from booktypes where bookTypes_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Booktypes booktypes = null;
		while(rst.next()) {
			booktypes = assemble(rst);
		 }
		 return booktypes;
	}
	
	public void add(Booktypes dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into booktypes(bookTypes_id,bookTypes_name,bookTypes_note) VALUES(?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getBookTypes_id());
		pst.setString(1,dataObj.getBookTypes_name());
		pst.setString(1,dataObj.getBookTypes_note());

	    pst.executeUpdate();
	
	}
	
	public void modify(Booktypes newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update booktypes set bookTypes_id=?,bookTypes_name=?,bookTypes_note=? where bookTypes_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getBookTypes_id());
		pst.setString(2,newDataObj.getBookTypes_name());
		pst.setString(3,newDataObj.getBookTypes_note());
		pst.setInt(2,newDataObj.getBookTypes_id());
		
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM booktypes WHERE bookTypes_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Booktypes assemble(ResultSet rst) throws SQLException {

		Booktypes booktypes = new Booktypes();
		booktypes.setBookTypes_id(rst.getInt("bookTypes_id"));
		booktypes.setBookTypes_name(rst.getString("bookTypes_name"));
		booktypes.setBookTypes_note(rst.getString("bookTypes_note"));
		
		
		return booktypes;
	
	}

}
