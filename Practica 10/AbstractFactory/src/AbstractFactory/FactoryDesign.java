package AbstractFactory;

public class FactoryDesign implements Factory{
	
	@Override
	public Service crearServicio() {
		return new ServiceDesign();
	}

}
