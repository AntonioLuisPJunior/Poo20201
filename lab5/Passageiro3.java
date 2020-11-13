package lab5;

public class Passageiro3 {

	// campos e metodos omitidos

	private int malasDespachadas;
	private int malasGratis;

	// metodos acessadores e modificadores omitidos

	private double taxaPorBagagem;

	public void setMalasDespachadas(int malasDespachadas) {
		this.malasDespachadas = malasDespachadas;
	}

	// se nao houver construtores explicitos, o java fornece um
	public Passageiro3() {}

	// uma classe pode ter varios construtores
	public Passageiro3(int malasGratis) {
		this(malasGratis > 1 ? 25.0d : 50.0d);
		this.malasGratis = malasGratis; // logica duplicada
	}

	public Passageiro3(int malasGratis, int malasDespachadas) {
		//this.malasGratis = malasGratis; // logica duplicada
		this(malasGratis);
		this.malasDespachadas = malasDespachadas;
	}

	//public Passageiro3(double taxaPorBagagem) {
	private Passageiro3(double taxaPorBagagem) {
		this.taxaPorBagagem = taxaPorBagagem;
	}

	// outros membros omitidos

	public static void main(String[] args) {

		//Passageiro3 pedro = new Passageiro3(0.01d); // evitar isso

		Passageiro3 joao = new Passageiro3(2);
		Passageiro3 maria = new Passageiro3(2, 3);
	}	

}
