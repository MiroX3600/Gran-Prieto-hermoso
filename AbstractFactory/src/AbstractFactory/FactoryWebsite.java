package AbstractFactory;

public class FactoryWebsite implements Factory{
	
	@Override
	public Service crearServicio() {
		return new ServiceWebsites();
	}

}
