package cn.edu.nsu.bookshop.db.last.comments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;


public class CommentsDAO extends DBMain<Comments>{
	public ArrayList<Comments> getAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from comments";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Comments> comments = new ArrayList<Comments>();
		while(rst.next()) {
			comments.add(assemble(rst));
		}
		return comments;
	}
    public Comments getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from comments where comments_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Comments comments = null;
		while(rst.next()) {
			comments = assemble(rst);
		 }
		 return comments;
	}
	
	public void add(Comments dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into comments(comments_id,users_id,books_id,comments_content,comments_time) VALUES(?,?,?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getComments_id());
		pst.setInt(1,dataObj.getUsers_id());
		pst.setInt(1,dataObj.getBooks_id());
		pst.setString(1,dataObj.getComments_content());
		pst.setString(1,dataObj.getComments_time());
	    pst.executeUpdate();
	
	}
	
	public void modify(Comments newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update comments set comments_id=?,users_id=?,books_id=?,comments_content=?,comments_time=? where comments_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getComments_id());
		pst.setInt(1,newDataObj.getUsers_id());
		pst.setInt(1,newDataObj.getBooks_id());
		pst.setString(2,newDataObj.getComments_content());
		pst.setString(3,newDataObj.getComments_time());
		pst.setInt(1,newDataObj.getComments_id());
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM comments WHERE comments_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Comments assemble(ResultSet rst) throws SQLException {

		Comments comments = new Comments();
		comments.setComments_id(rst.getInt("comments_id"));
		comments.setUsers_id(rst.getInt("users_id"));
		comments.setBooks_id(rst.getInt("books_id"));
		comments.setComments_content(rst.getString("comments_content"));
		comments.setComments_time(rst.getString("comments_time"));
		
		return comments;
	
	}
}
