package cn.edu.nsu.bookshop.db.last.books;

import java.sql.SQLException;


public class BooksDAOTest {



	private static BooksDAO booksDAO = new BooksDAO();
	
	public static void main(String[] args) {
		try 
		{
			getAllTest();
			//getByIdTest();
			//addTest();
			//modifyTest();
			//deleteTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				booksDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(booksDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(booksDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Books dataObj = new Books();
		
		dataObj.setBooks_id(1);
		dataObj.setBookTypes_id(1);
		dataObj.setBooks_ISBN("");
		dataObj.setBooks_name("java");
		dataObj.setBooks_author("zhang");
		dataObj.setBooks_publisher("");
		dataObj.setBooks_price(48);
		dataObj.setBooks_note("web");
		dataObj.setBooks_faceImg("");
		dataObj.setBooks_inDate("2017");
		
		
		booksDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Books dataObj = new Books();
		
		dataObj.setBooks_id(2);
		dataObj.setBookTypes_id(2);
		dataObj.setBooks_ISBN("");
		dataObj.setBooks_name("java");
		dataObj.setBooks_author("zhang");
		dataObj.setBooks_publisher("");
		dataObj.setBooks_price(48);
		dataObj.setBooks_note("web");
		dataObj.setBooks_faceImg("");
		dataObj.setBooks_inDate("2018");
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		booksDAO.delete(1);
	}



}
