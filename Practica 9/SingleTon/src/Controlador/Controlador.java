package Controlador;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controlador {
	
	private static Controlador INSTANCE = null;
	private int hora, minutos, segundos, dia;
	
		private Controlador () {
		
			Calendar calendario = new GregorianCalendar();
			dia = calendario.get(Calendar.DAY_OF_MONTH);
			hora = calendario.get(Calendar.HOUR_OF_DAY);
			minutos = calendario.get(Calendar.MINUTE);
			segundos = calendario.get(Calendar.SECOND);
		}
		
		public static Controlador getControlador() {
			
			if (INSTANCE == null) {
				INSTANCE = new Controlador();
			}
			
			return INSTANCE;
			
		}
		
		public String toString () {
			
			return "Dia: "+ dia + ", Hora: " + hora + ", Minuto: " + minutos + ", Segundos: " + segundos;
			
		}
		
}
