package frame;

public class OracleProductDao implements Dao {

	@Override
	public void insert() {
		System.out.println("Oracle Product Dao inserted...");
	}

	@Override
	public void delete() {
		System.out.println("Oracle Product Dao deleted...");
	}

	@Override
	public void update() {
		System.out.println("Oracle Product Dao updated...");
	}

}
