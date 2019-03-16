<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC (Resultado)</title>
   </head>
   <body>

      <h2>Información del estudiante</h2>
      <table>
         <tr>
            <td>Nombre:</td>
            <td>${nombre}</td>
         </tr>
         <tr>
            <td>Apellido:</td>
            <td>${apellido}</td>
         </tr>
         <tr>
            <td>Edad:</td>
            <td>${edads}</td>
         </tr>
         <tr>
            <td>Matricula:</td>
            <td>${matricula}</td>
         </tr>
         <tr>
            <td>Facultad:</td>
            <td>${facultad}</td>
         </tr>
      </table>  
   </body>
</html>