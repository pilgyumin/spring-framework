package frame;

public class CustBiz implements Biz {
	
	Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register() {
		dao.insert();

	}

	@Override
	public void remove() {
		dao.delete();

	}

	@Override
	public void modify() {
		dao.update();

	}

}
