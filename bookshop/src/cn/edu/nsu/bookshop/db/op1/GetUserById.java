/**
 * 
 */
package cn.edu.nsu.bookshop.db.op1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class GetUserById extends DBMain
{
//	private Connection con = null;
//	private PreparedStatement pst = null;
//	private ResultSet rst = null;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
			GetUserById getUserById = new GetUserById();
			getUserById.getUserById();
	}

	private void getUserById()
	{
		try {
//			//����JDBC����
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//���DB����
//			 con = DriverManager.getConnection("jdbc:mysql://172.17.130.84:3306/bookshop_bigdata?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "zxh751106");
//			
			//��װSQL
			String sql = "select * from users where users_id=?";
			 pst = getPrepareStatement(sql);
			//������
			pst.setInt(1, 1);
			//ִ��SQL
			 rst = pst.executeQuery();
			//�����������
			while(rst.next())
			{
				System.out.print(rst.getInt("users_id")+"\t");
				System.out.print(rst.getInt("roles_id")+"\t");
				System.out.print(rst.getString("users_name")+"\t");
				System.out.print(rst.getString("users_sex")+"\t");
				System.out.print(rst.getString("users_idNum")+"\t");
				System.out.print(rst.getString("users_mobile")+"\t");
				System.out.print(rst.getString("users_address")+"\t");
				System.out.print(rst.getString("users_postcode")+"\t");
				System.out.print(rst.getString("users_portraitImg")+"\t");
				System.out.println(rst.getString("users_password"));
			}
			//�ر�DB����
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}