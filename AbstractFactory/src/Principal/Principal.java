package Principal;

import AbstractFactory.Factory;
import AbstractFactory.Service;
import AbstractFactory.FactoryDesign;
import AbstractFactory.FactorySoftware;
import AbstractFactory.FactoryWebsite;
import java.util.Scanner;

public class Principal {
	
	private static Scanner S = new Scanner (System.in);
	
	public static void main (String [] args) {
		int o;
		
		do {
			o = preguntarServicio();
			
			switch (o) {
			
				case 1:
					usarServicio (new FactoryDesign());
				break;
				
				case 2:
					usarServicio (new FactorySoftware());
				break;
				
				case 3:
					usarServicio (new FactoryWebsite());
				break;
				
				case 4:
					System.out.println ("Cerrando programa... ");
				break;
				
				default:
					System.out.println ("No se encuentra la opcion");
				break;
			}
			
			System.out.println ("\n");
			
		} while (o != 4);
		
	}
	
	public static void usarServicio (Factory factory) {
		Service servicio = factory.crearServicio();
		servicio.asignarTrabajo();
		servicio.indicarFechaEntrega();
		servicio.InformarSobrePago();
	}
	
	public static int preguntarServicio() {
		
		System.out.println(
				"Opciones \n"
			+	"1.- Diseñador Grafico \n"
			+	"2.- Especialista de software \n"
			+	"3.- Diseñador Web \n"
			+	"Seleccion: ");
		
		return Integer.parseInt (S.nextLine() );
	}

}
