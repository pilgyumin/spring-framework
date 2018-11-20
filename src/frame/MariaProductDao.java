package frame;

public class MariaProductDao implements Dao {

	@Override
	public void insert() {
		System.out.println("Maria Product Dao inserted...");
	}

	@Override
	public void delete() {
		System.out.println("Maria Product Dao deleted...");
	}

	@Override
	public void update() {
		System.out.println("Maria Product Dao updated...");
	}

}
