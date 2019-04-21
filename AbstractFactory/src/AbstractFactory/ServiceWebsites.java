package AbstractFactory;

public class ServiceWebsites implements Service {
	
	@Override
	public void asignarTrabajo() {
		System.out.println ("Informado a diseñadores web ");
	}
	
	@Override
	public void indicarFechaEntrega() {
		System.out.println ("Se ha fijado fecha de entrega");
	}
	
	@Override
	public void InformarSobrePago() {
		System.out.println ("se ha fijado monto a pagar");
	}

}
