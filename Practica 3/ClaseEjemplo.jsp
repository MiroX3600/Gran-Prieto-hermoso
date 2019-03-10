import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClaseEjemplo extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			
		out.println ("<html>");
		out.println ("<head>");
		out.println ("	<script type = "text/javascript">");
		out.println ("		alert ("Bienaventurado seais los que entreis a esta página, llenad vuestros datos");");
		out.println ("	</script>");
		out.println ("</head>");
		out.println ("<body>");
		out.println ("	<form method = "POST" action = "ClaseEjemplo">");
		out.peinrln ("		<table>");
		out.println ("		<tr>");
		out.println ("			<td> Nombre </td>");
		out.println ("			<td><input name = "Nombre" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Apellido </td>");
		out.println ("			<td><input name = "Apellido" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Correo </td>");
		out.println ("			<td><input name = "Correo" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Contrasena </td>");
		out.println ("			<td><input name = "Contraseña" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Telefono </td>");
		out.println ("			<td><input name = "Telefono" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Dia de nacimiento</td>");
		out.println ("			<td><input name = "Dia" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Mes de nacimiento</td>");
		out.println ("			<td><input name = "Mes" /></td>");
		out.println ("		</tr>");
		out.println ("		<tr>");
		out.println ("			<td> Año de nacimiento</td>");
		out.println ("			<td><input name = "Ano" /></td>");
		out.println ("		</tr>");
		out.println ("		</table>");
		out.println ("			<input type = "submit" />");
		out.println ("	</form>");
		out.println ("</body>");
		out.println ("</html>");
		
		}
	
	}
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
	 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
	 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

	
	
	
	