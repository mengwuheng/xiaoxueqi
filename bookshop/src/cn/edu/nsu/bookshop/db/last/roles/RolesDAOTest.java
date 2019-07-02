/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.roles;

import java.sql.SQLException;


/**
 * @author Lenovo
 *
 */
public class RolesDAOTest {

	private static RolesDAO rolesDAO = new RolesDAO();
	
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
				rolesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void getAllTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(rolesDAO.getAll());
	}
	
	private static void getByIdTest() throws ClassNotFoundException, SQLException
	{
		System.out.println(rolesDAO.getById(1));
	}
	
	private static void addTest() throws ClassNotFoundException, SQLException
	{
		Roles dataObj = new Roles();
		
		dataObj.setRoles_id(2);
		dataObj.setRoles_name("图书管理员");
		dataObj.setRoles_note("可免费阅读最新书籍");
		
		rolesDAO.add(dataObj);
	}

	private static void modifyTest() throws ClassNotFoundException, SQLException
	{
		Roles dataObj = new Roles();
		
		dataObj.setRoles_id(3);
		dataObj.setRoles_name("普通管理员");
		dataObj.setRoles_note("阅读提供的免费书籍");
		
		rolesDAO.modify(dataObj);
	}

	private static void deleteTest() throws ClassNotFoundException, SQLException
	{
		rolesDAO.delete(4);
	}
}
