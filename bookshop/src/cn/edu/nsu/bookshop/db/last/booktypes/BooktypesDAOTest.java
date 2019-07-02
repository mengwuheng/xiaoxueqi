package cn.edu.nsu.bookshop.db.last.booktypes;

import java.sql.SQLException;



public class BooktypesDAOTest {


	private static BooktypesDAO booktypesDAO = new BooktypesDAO();
	
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
				booktypesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(booktypesDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(booktypesDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Booktypes dataObj = new Booktypes();
		
		dataObj.setBookTypes_id(2);
		dataObj.setBookTypes_name("小说");
		dataObj.setBookTypes_note("言情类");
		
		
		booktypesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Booktypes dataObj = new Booktypes();
		
		dataObj.setBookTypes_id(2);
		dataObj.setBookTypes_name("小说");
		dataObj.setBookTypes_note("玄幻类");
		
		booktypesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		booktypesDAO.delete(1);
	}


}
