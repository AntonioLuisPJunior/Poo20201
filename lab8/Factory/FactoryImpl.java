package lab8.Factory;

public class FactoryImpl extends Factory {		// subclasse factory
	public BookDao createDao() {
		if (Util.isTestMode()) {
			return new InMemoryBookDao();	// para teste
		} else {
			return new OracleBookDao();	// para producao
		}
	}
}