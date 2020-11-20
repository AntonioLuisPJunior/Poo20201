package lab8;

public class Clientes implements ICrud {

    @Override
    public void create() {
        // TODO Auto-generated method stub

    }

    @Override
    public void read() {
        // TODO Auto-generated method stub

    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Object o) {
        // TODO Auto-generated method stub

    }
    public static void main(String... args) {
		Clientes clientes = new Clientes();

		// IDB generico1 = clientes;
		ICrud generico2 = new Clientes();
	}
}
