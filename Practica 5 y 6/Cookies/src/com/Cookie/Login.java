package com.Cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doGet (HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
		
		Cookie ID = new Cookie ("ID", req.getParameter ("ID"));
		Cookie Usuario = new Cookie ("Usuario", req.getParameter("Usuario"));
		
		ID.setMaxAge(60 * 60 * 24);
		Usuario.setMaxAge(60 * 60 *24);
		
		res.addCookie(ID);
		res.addCookie(Usuario);
		
		res.setContentType ("text/html");
		
		PrintWriter out = res.getWriter ();
		String title = "Metodo Get para obtener info.";
		String docType =
				"<!doctype html public \"-//w3c//dtd html 4.0 " +
				"transitional//en\">\n";
		out.println (docType + 
			"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body bgcolor = \"#f0f0f0\">\n" +
					"<h1 align = \"center\">" + title + "</h1>\n" +
					"<ul>\n" +
						" <li><b>ID</b>: "
						+ req.getParameter("ID") + "\n" +
						" <li><b>Usuario</b>: "
						+ req.getParameter("Usuario") + "\n" +
					"</ul>\n" +
				"</body>"
			"</html>"	
		);
	}
	
	public void doPost (HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
	}

}