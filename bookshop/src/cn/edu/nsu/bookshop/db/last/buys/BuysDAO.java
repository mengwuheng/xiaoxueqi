package cn.edu.nsu.bookshop.db.last.buys;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;


public class BuysDAO extends DBMain<Buys>{
	public ArrayList<Buys> getAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from buys";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Buys> buys = new ArrayList<Buys>();
		while(rst.next()) {
			buys.add(assemble(rst));
		}
		return buys;
	}
    public Buys getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from buys where buys_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Buys buys = null;
		while(rst.next()) {
			buys = assemble(rst);
		 }
		 return buys;
	}
	
	public void add(Buys dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into buys(buys_id,books_id,users_id,buys_num) VALUES(?,?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getBuys_id());
		pst.setInt(1,dataObj.getBooks_id());
		pst.setInt(1,dataObj.getUsers_id());
		pst.setInt(1,dataObj.getBuys_num());
	    pst.executeUpdate();
	
	}
	
	public void modify(Buys newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update buys set buys_id=?,books_id=?,users_id=?,buys_num=? where buys_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getBuys_id());
		pst.setInt(1,newDataObj.getBooks_id());
		pst.setInt(1,newDataObj.getUsers_id());
		pst.setInt(1,newDataObj.getBuys_num());
		pst.setInt(1,newDataObj.getBuys_id());
		
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM buys WHERE buys_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Buys assemble(ResultSet rst) throws SQLException {

		Buys buys = new Buys();
		buys.setBuys_id(rst.getInt("buys_id"));
		buys.setBooks_id(rst.getInt("books_id"));
		buys.setUsers_id(rst.getInt("users_id"));
		buys.setBuys_num(rst.getInt("buys_num"));
		
		
		return buys;
	
	}
}
