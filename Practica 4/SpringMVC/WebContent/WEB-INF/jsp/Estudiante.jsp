<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC (practica 4)</title>
   </head>
   
   <body>
      <h2>Información del estudiante</h2>
      <form:form method = "POST" action = "/HelloWeb/addStudent">
         <table>
            <tr>
               <td><form:label path = "nombre">Nombre:</form:label></td>
               <td><form:input path = "nombre" /></td>
            </tr>
            <tr>
               <td><form:label path = "apellido">Apellido:</form:label></td>
               <td><form:input path = "apellido" /></td>
            </tr>
            <tr>
               <td><form:label path = "edad">Edad:</form:label></td>
               <td><form:input path = "edad" /></td>
            </tr>
            <tr>
               <td><form:label path = "matricula">Matricula:</form:label></td>
               <td><form:input path = "matricula" /></td>
            </tr>
            <tr>
               <td><form:label path = "facultad">Facultad:</form:label></td>
               <td><form:input path = "facultad" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>