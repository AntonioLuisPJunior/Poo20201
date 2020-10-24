package Aula6;

// Voo.java
public class Voo {
	
	int passageiros;
	int poltronas;
	
	Voo() {
		passageiros = 0;
		poltronas = 150;
	}

	void adicionarPassageiro() {
		if(passageiros < poltronas) {
			passageiros += 1;
		}
	}

	public static void main(String[] args) {
		Voo voo = new Voo();
		voo.adicionarPassageiro();

		Voo slzParaBsb;
		slzParaBsb = new Voo();
		
		Voo slzParaVcp = new Voo();
		slzParaVcp.adicionarPassageiro();

		Voo voo1 = new Voo();
		Voo voo2 = new Voo();

		voo2.adicionarPassageiro();
		System.out.println(voo2.passageiros); // 1

		voo2 = voo1;
		System.out.println(voo2.passageiros); // 0

		voo1.adicionarPassageiro();
		voo1.adicionarPassageiro();

		System.out.println(voo2.passageiros); // 2
	}

}