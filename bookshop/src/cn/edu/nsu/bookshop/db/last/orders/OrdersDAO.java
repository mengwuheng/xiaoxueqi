package cn.edu.nsu.bookshop.db.last.orders;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;



public class OrdersDAO extends DBMain<Orders>{
	
	public ArrayList<Orders> getAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from orders";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Orders> orders = new ArrayList<Orders>();
		while(rst.next()) {
			orders.add(assemble(rst));
		}
		return orders;
	}
public Orders getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from orders where orders_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Orders orders = null;
		while(rst.next()) {
			 orders = assemble(rst);
		 }
		 return orders;
	}
	
	public void add(Orders dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into orders(orders_id,users_id,orders_time,orders_totalMoney) VALUES(?,?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getOrders_id());
		pst.setInt(1,dataObj.getUsers_id());
		pst.setString(1,dataObj.getOrders_time());
		pst.setFloat(1,dataObj.getOrders_totalMoney());
	    pst.executeUpdate();
	
	}
	
	public void modify(Orders newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update orders set orders_id=?,users_id=?,orders_time=?,orders_totalMoney=? where orders_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getOrders_id());
		pst.setInt(2,newDataObj.getUsers_id());
		pst.setString(10,newDataObj.getOrders_time());
		pst.setFloat(4,newDataObj.getOrders_totalMoney());
		pst.setInt(2,newDataObj.getOrders_id());
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM orders WHERE orders_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Orders assemble(ResultSet rst) throws SQLException {

		Orders orders = new Orders();
		orders.setOrders_id(rst.getInt("orders_id"));
		orders.setUsers_id(rst.getInt("users_id"));
		orders.setOrders_time(rst.getString("orders_time"));
		orders.setOrders_totalMoney(rst.getFloat("orders_totalMoney"));
		
		return orders;
	
	}
}
