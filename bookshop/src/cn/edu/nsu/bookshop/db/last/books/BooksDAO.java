package cn.edu.nsu.bookshop.db.last.books;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;


public class BooksDAO extends DBMain<Books> {
	public ArrayList<Books> getAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from books";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Books> books = new ArrayList<Books>();
		while(rst.next()) {
			books.add(assemble(rst));
		}
		return books;
	}
	
	public Books getById(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from books where books_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Books books = null;
		while(rst.next()) {
			books = assemble(rst);
		 }
		 return books;
	}
	
	public void add(Books dataObj) throws ClassNotFoundException, SQLException {

		String sql = "INSERT into books(books_id,bookTypes_id,books_ISBN,books_name,books_author,books_publisher,"
				+ "books_price,books_note,books_faceImg,books_inDate) VALUES(?,?,?,?,?,?,?,?,?,?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1,dataObj.getBooks_id());
		pst.setInt(1,dataObj.getBookTypes_id());
		pst.setString(1,dataObj.getBooks_ISBN());
		pst.setString(1,dataObj.getBooks_name());
		pst.setString(1,dataObj.getBooks_author());
		pst.setString(1,dataObj.getBooks_publisher());
		pst.setFloat(1,dataObj.getBooks_price());
		pst.setString(1,dataObj.getBooks_note());
		pst.setString(1,dataObj.getBooks_faceImg());
		pst.setString(1,dataObj.getBooks_inDate());

	    pst.executeUpdate();
	
	}
	
	public void modify(Books newDataObj) throws ClassNotFoundException, SQLException {

		String sql = "update books set books_id=?,bookTypes_id=?,books_ISBN=?,books_name=?,books_author=?,"
				+ "books_publisher=?,books_price=?,books_note=?,books_faceImg=?,books_inDate=? where books_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,newDataObj.getBooks_id());
		pst.setInt(2,newDataObj.getBookTypes_id());
		pst.setString(2,newDataObj.getBooks_ISBN());
		pst.setString(3,newDataObj.getBooks_name());
		pst.setString(2,newDataObj.getBooks_author());
		pst.setString(4,newDataObj.getBooks_publisher());
		pst.setFloat(2,newDataObj.getBooks_price());
		pst.setString(2,newDataObj.getBooks_note());
		pst.setString(2,newDataObj.getBooks_faceImg());
		pst.setString(2,newDataObj.getBooks_inDate());
		pst.setInt(2,newDataObj.getBooks_id());
		
	    pst.executeUpdate();	
	
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		String sql = "DELETE FROM books WHERE books_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();	
	}

	public Books assemble(ResultSet rst) throws SQLException {

		Books books = new Books();
		books.setBooks_id(rst.getInt("books_id"));
		books.setBookTypes_id(rst.getInt("bookTypes_id"));
		books.setBooks_ISBN(rst.getString("books_ISBN"));
		books.setBooks_name(rst.getString("books_name"));
		books.setBooks_author(rst.getString("books_author"));
		books.setBooks_publisher(rst.getString("books_publisher"));
		books.setBooks_price(rst.getFloat("books_price"));
		books.setBooks_note(rst.getString("books_note"));
		books.setBooks_faceImg(rst.getString("books_faceImg"));
		books.setBooks_inDate(rst.getString("books_inDate"));
		
		
		return books;
	
	}
}
