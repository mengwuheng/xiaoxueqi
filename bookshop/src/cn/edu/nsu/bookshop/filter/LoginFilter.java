package cn.edu.nsu.bookshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import cn.edu.nsu.bookshop.db.last.users.Users;

/*
 * 后台请求进行登录验证
 * */
public class LoginFilter  implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse respponse, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// 从session中取出登录用户信息
		((HttpServletRequest)request).getSession().setAttribute("USER_LOGIN", new Users());
		Object user =((HttpServletRequest)request).getSession().getAttribute("USER_LOGIN");
		//如果登录用户信息存在（合法放行)
		if(user != null)
		{
			chain.doFilter(request, respponse);
		
		}
			
		//登录信息不存在  （非法导向到登录表单页面）
		else {
			request.getRequestDispatcher("/pages/admin/index.html").forward(request, respponse);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
