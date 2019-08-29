package cn.edu.nsu.xiaoxueqi.db.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.xiaoxueqi.db.last.DBMain;


public class TestDAO extends DBMain<Test>{

	@Override
	public ArrayList<Test> getAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Test getById(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Test dataObj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Test newDataObj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Test assemble(ResultSet rst) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
