package lab8.Factory;

public class Student {
	public static void main(String[] args) {
		Factory factory = new FactoryImpl();
		BookDao dao = factory.createDao();	// cria o dao
		// trabalha com dao
	}
}