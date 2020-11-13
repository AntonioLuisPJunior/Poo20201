package lab5;

public class Voo {

	int numeroVoo;

	// acessores e modificadores removidos para maior clareza
	
	public Voo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	// outros membros removidos para clareza

	static void trocar(Voo i, Voo j) {
		Voo k = i;
		i = j;
		j = k;

		//int k = i.getNumeroVoo();
		//i.setNumeroVoo(j.getNumeroVoo());
		//j.setNumeroVoo(k);

		// print i & j
		System.out.println(i.numeroVoo + " " + j.numeroVoo);
	}

	public static void main(String[] args) {
		Voo voo1 = new Voo(10);
		Voo voo2 = new Voo(20);

		// print voo1 & voo2
		System.out.println(voo1.numeroVoo  + " " + voo2.numeroVoo);

		trocar(voo1, voo2);

		// print voo1 & voo2
		System.out.println(voo1.numeroVoo  + " " + voo2.numeroVoo);
	}

}

