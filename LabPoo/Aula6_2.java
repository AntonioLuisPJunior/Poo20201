package labPoo;

public class Aula6_2 {
	public static void main(String[] args) {
		//Passageiro2 joao = new Passageiro2();
		Passageiro2 joao = new Passageiro2(2);
		joao.setMalasDespachadas(3);
		Passageiro2 maria = new Passageiro2(2, 3);
		}
	}


public class Passageiro2{
	// campos e metodos omitidos
	private int malasDespachadas;
	private int malasGratis;
	// metodos acessadores e modificadores omitidos
	private double taxaPorBagagem;
	public void setMalasDespachadas(int malasDespachadas) {
	this.malasDespachadas = malasDespachadas;
	}
	// se nao houver construtores explicitos, o java fornece um
	public Passageiro2() {}
	// uma classe pode ter varios construtores
	public Passageiro2(int malasGratis) {
	this.malasGratis = malasGratis; // logica duplicada
	}
	public Passageiro2(int malasGratis, int malasDespachadas) {
	//this.malasGratis = malasGratis; // logica duplicada
	this(malasGratis);
	this.malasDespachadas = malasDespachadas;
	}
	// outros membros omitido
}