package Controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Login" })
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String username = req.getParameter("username");
	     String password = req.getParameter("password");
	     
	     ServletContext context = getServletContext();
	     
	     String storedUser = context.getInitParameter("UserName");
	     String storedPass = context.getInitParameter("PassWord");
	     
	     if (username.equals(storedUser)&& password.equals(storedPass)) {
			//login success
	    	 resp.sendRedirect("Success.jsp");
	    	 
		} else {
			//login fail
			resp.sendRedirect("Failure.jsp");
		}
	     
	}
}
