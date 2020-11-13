package lab5;

public class Passageiro1 {

	private int malasDespachadas;
	private int malasGratis;

	// metodos acessadores e modificadores omitidos

	private double taxaPorBagagem;

	public void setMalasDespachadas(int malasDespachadas) {
		this.malasDespachadas = malasDespachadas;
	}

	// se nao houver construtores explicitos, o java fornece um
	public Passageiro1() {}

	// uma classe pode ter varios construtores
	public Passageiro1(int malasGratis) {
		this.malasGratis = malasGratis;
	}

	// outros membros omitidos

	public static void main(String[] args) {
		
		//Passageiro1 joao = new Passageiro1();
		Passageiro1 joao = new Passageiro1(2);
		joao.setMalasDespachadas(3);

		Passageiro1 maria = new Passageiro1(2);
		maria.setMalasDespachadas(3);
	}	

}