package cn.edu.nsu.bookshop.db.last.functions;

import java.sql.SQLException;



public class FunctionsDAOTest {
	private static FunctionsDAO functionsDAO = new FunctionsDAO();
	
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
				functionsDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(functionsDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(functionsDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Functions dataObj = new Functions();
		
		dataObj.setFunctions_id(2);
		dataObj.setFunctions_name("管理");
		dataObj.setFunctions_URI("");
		dataObj.setFunctions_note("");
		
		functionsDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Functions dataObj = new Functions();
		
		dataObj.setFunctions_id(2);
		dataObj.setFunctions_name("管理");
		dataObj.setFunctions_URI("");
		dataObj.setFunctions_note("");
		
		functionsDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		functionsDAO.delete(1);
	}
}
