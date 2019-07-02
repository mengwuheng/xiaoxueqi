package cn.edu.nsu.bookshop.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.bookshop.db.last.roles.Roles;
import cn.edu.nsu.bookshop.db.last.roles.RolesDAO;
import cn.edu.nsu.bookshop.db.last.users.Users;
import cn.edu.nsu.bookshop.db.last.users.UsersDAO;

/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo=request.getPathInfo();
		UsersDAO userDAO = new UsersDAO();
		RolesDAO rolesDAO = new RolesDAO();
		try {
			if("/List".equals(pathInfo))
			{
				//�����û��б�������Ĵ���
//1.�����ѯ����
				
				ArrayList<Users> users= userDAO.getAll();
				//2.���ݹ���
				request.setAttribute("users", users);
				//3.�����ɷ�
				request.getRequestDispatcher("/pages/admin/users/list.jsp").forward(request, response);
			}
			else if("/OpenModify".equals(pathInfo))
			{
			
                String users_id =request.getParameter("users_id");
                 Integer user_id =Integer.parseInt("users_id");
            	
                  	Users user =userDAO.getById(user_id);
                  	ArrayList<Roles> roles=rolesDAO.getAll();
                  	
                  	request.setAttribute("user", user);
                  	request.setAttribute("roles", roles);
                  	
                	request.getRequestDispatcher("/pages/admin/users/list.jsp").forward(request, response);

                  	
			}
			else if("/Modify".equals(pathInfo))
			{
				  request.setCharacterEncoding("utf-8");
				    //�������л�ø��ĺ���û�����
				    String users_id = request.getParameter("users_id");
				    String roles_id = request.getParameter("roles_id");
				    String users_name = request.getParameter("users_name");
				    String users_sex = request.getParameter("users_sex");
				    String users_idNum = request.getParameter("users_idNum	");
				    String users_mobile = request.getParameter("users_mobile");
				    String users_address = request.getParameter("users_address");
				    String users_postcode = request.getParameter("users_postcode");
				    String users_portraitImg = request.getParameter("users_portraitImg");
				    String users_password = request.getParameter("users_password");
				    
				    //�����ĺ���û����ݸ��µ�User���ж�Ӧ��¼
				   
				    Users users = new Users();
				    users.setUsers_id((Integer.parseInt(users_id)));
				    users.setRoles_id((Integer.parseInt(roles_id)));
				    users.setUsers_name(users_name);
				    users.setUsers_sex(users_sex);
				    users.setUsers_idNum(users_idNum);
				    users.setUsers_mobile(users_mobile);
				    users.setUsers_address(users_address);
				    users.setUsers_postcode(users_postcode);
				    users.setUsers_portraitImg(users_portraitImg);
				    users.setUsers_password(users_password);
				    
				    userDAO.modify(users);
				    //
				    //
					request.getRequestDispatcher("/pages/admin/users/modifySuccess.jsp").forward(request, response);


			}
			else if("/OpenAdd".equals(pathInfo))
			{
				
			}
			else if("/Add".equals(pathInfo))
			{
				
			}
			else if("/Delete".equals(pathInfo))
			{
				
			}
			else if("/Detall".equals(pathInfo))
			{
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				userDAO.release();
			    rolesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
