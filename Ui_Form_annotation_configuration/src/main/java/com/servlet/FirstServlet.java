package com.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/info")
public class FirstServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) 
	throws ServletException, IOException
	{
     String name = req.getParameter("nm");
     String place = req.getParameter("pl");
     res.setContentType("text/html");
     PrintWriter out = res.getWriter();
     out.print("<html> <body bgcolor='blue'>"
    	+ "<h1> Name = "+name+"from"+place+"</h1>"+"</body></html>");
     out.close();
	}

}
