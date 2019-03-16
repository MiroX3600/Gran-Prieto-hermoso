package com.Practica4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class ControlEstudiantes {

   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView Estudiante() {
      return new ModelAndView("student", "command", new Estudiante());
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute ("SpringWeb")Estudiante Estudiante, 
   ModelMap model) {
	   
      model.addAttribute("nombre", Estudiante.getNombre());
      model.addAttribute("apellido", Estudiante.getApellido());
      model.addAttribute("edad", Estudiante.getEdad());
      model.addAttribute("matricula", Estudiante.getMatricula());
      model.addAttribute("facultad", Estudiante.getFacultad());
      
      return "resultado";
   }
}