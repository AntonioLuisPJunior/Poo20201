package lab5;

public class Voo2novo {

	// blocos de inicializacao
	//private int passageiros, numeroVoo, assentos;
	private int passageiros, numeroVoo, assentos = 150;
	private char classeVoo;

	private boolean[] assentosDisponiveis;

	{
		assentosDisponiveis = new boolean[assentos];
		
		for(int i = 0; i< assentos; i++)
			assentosDisponiveis[i] = true;		
	}

	public Voo2novo() {
		//passageiros = 0; // valor padrao
		//assentos = 150;

		//assentosDisponiveis = new boolean[assentos];
		//
		//for(int i = 0; i< assentos; i++)
		//	assentosDisponiveis[i] = true;
	}

	public Voo2novo(int numeroVoo) {
		//this();
		this.numeroVoo = numeroVoo;
	}

	public Voo2novo(char classeVoo) {
		//this();
		this.classeVoo = classeVoo;
	}

	// outros membros omitidos

	public static void main(String[] args) {
		Voo2novo voo = new Voo2novo();
		Voo2novo voo2 = new Voo2novo(10);
		Voo2novo voo3 = new Voo2novo('e');
		System.out.println(voo.passageiros);
		System.out.println(voo.assentos);
		System.out.println(voo.assentosDisponiveis[0]);
	}

}
