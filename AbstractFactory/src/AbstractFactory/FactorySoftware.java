package AbstractFactory;

public class FactorySoftware implements Factory {
	
	@Override
	public Service crearServicio(){
		return new ServiceSoftware();
	}

}
