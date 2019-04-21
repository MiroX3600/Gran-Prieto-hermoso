package AbstractFactory;

public class ServiceSoftware implements Service {
	
	@Override
	public void asignarTrabajo() {
		System.out.println ("Informado a programadores ");
	}
	
	@Override
	public void indicarFechaEntrega() {
		System.out.println ("Se ha fijado fecha de entrega");
	}
	
	@Override
	public void InformarSobrePago() {
		System.out.println ("Se ha fijado total a pagar");
	}

}
