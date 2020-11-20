package lab8.Factory;


public abstract class Factory {
	public BookDao createDao() {
		if (Util.isTestMode()) {
			return new InMemoryBookDao();
		} else {
			return createDatabaseBookDao(); // for subclass
		} // to implement
	}
	protected abstract BookDao createDatabaseBookDao();
}