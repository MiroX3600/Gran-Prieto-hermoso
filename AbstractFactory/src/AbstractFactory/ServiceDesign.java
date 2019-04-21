package AbstractFactory;

public class ServiceDesign implements Service {
	
	@Override
	public void asignarTrabajo() {
		System.out.println ("Informado a diseñadores");
	}
	
	@Override
	public void indicarFechaEntrega() {
		System.out.println ("Fecha asignada");
	}
	
	@Override
	public void InformarSobrePago() {
		System.out.println ("Realizar pago al recoger logo creado");
	}

}
