/**
 * 
 */
package cn.edu.nsu.bookshop.db.op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class ModifyUser
{
	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rst = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ModifyUser modifyUser = new ModifyUser();
		modifyUser.modifyUser();
	}
	
	private void modifyUser()
	{

		try {
			//����JDBC����
			Class.forName("com.mysql.cj.jdbc.Driver");
			//���DB����
			 con = DriverManager.getConnection("jdbc:mysql://172.17.130.84:3306/bookshop_bigdata?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "zxh751106");
			//��װSQL
			String sql = "update users set roles_id=?,users_name=?,users_sex=?,users_idNum=?,users_mobile=?,users_address=?,users_postcode=?,users_portraitImg=?,users_passwor=? where users_id=?";
			 pst = con.prepareStatement(sql);
			//������
			pst.setInt(1,2);
			pst.setString(2, "������");
			pst.setString(3, "Ů");
			pst.setString(4, "510181200912030123");
			pst.setString(5, "13408568561");
			pst.setString(6, "�������б���Сѧ");
			pst.setString(7, "611830");
			pst.setString(8, null);
			pst.setString(9, "123456");
			pst.setInt(10, 2);
			//ִ��SQL
		    pst.executeUpdate();
			//�����������			
			//�ر�DB����	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				if(rst != null)
				{
					rst.close();
				}
				if(pst != null)
				{
					pst.close();
				}
				if(con != null)
				{
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}