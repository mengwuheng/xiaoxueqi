package cn.edu.nsu.bookshop.db.last.predom;

import java.sql.SQLException;



public class PredomDAOTest {

	private static PredomDAO predomDAO = new PredomDAO();
	
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
				predomDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(predomDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(predomDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Predom dataObj = new Predom();
		
		dataObj.setPredoms_id(2);
		dataObj.setFunctions_id(2);
		dataObj.setRoles_id(2);
		
		predomDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Predom dataObj = new Predom();
		
		dataObj.setPredoms_id(3);
		dataObj.setFunctions_id(3);
		dataObj.setRoles_id(3);
		
		predomDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		predomDAO.delete(1);
	}
}
