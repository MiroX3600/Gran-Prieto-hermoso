
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClaseEjemplo extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			PrintWriter out = resp.getWriter();
			
			out.println ("<html>");
			out.println ("<head></head>");
			out.println ("<body>");
			
			out.println ("Usuario: ");
			String usu = req.getParameter ("Nombre");
			String ape = req.getParameter ("Apellido");
			out.println (usu + ape);
			
			out.println ("Correo: ");
			String Correo = req.getParameter ("Correo");
			out.println (Correo);
			
			out.println ("Contraseña: ");
			String Contra = req.getParameter ("Contraseña");
			out.println (Contra);
			
			out.println ("Telefono: ");
			int Tele = req.getParameter ("Telefono");
			out.println (Tele);
			
			out.println ("Fecha de nacimiento: ");
			int Dia = req.getParameter ("Dia");
			String Mes = req.getParameter ("Mes");
			int Año = req.getParameter ("Año");
			out.println (Dia + Mes + Año);
			
			out.println("hoy es: " + new Date());
			out.println("</body>");
			out.println("</html>");
	}
	
}