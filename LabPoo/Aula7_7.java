package labPoo;

public class Voo {
	int numeroVoo, totalBagagensVerificadas, passageiros, poltronas;
	// acessores e modificadores removidos para maior clareza
	public Voo() { }
	public Voo(int numeroVoo) {
	this.numeroVoo = numeroVoo;
	}
	// outros membros removidos para clareza
	public void adicionarPassageiros(Passageiro... lista) {
	if (verificarDisponibilidadePoltrona(lista.length)) {
	passageiros += lista.length;
	for (Passageiro passageiro : lista)
	totalBagagensVerificadas += passageiro.getBagagensVerificadas();
	} else
	tratarExcesso();
	}
	private boolean verificarDisponibilidadePoltrona(int total) {
	return passageiros + total <= poltronas;
	}
	void tratarExcesso() { }
}

public class Aula7_7{
 public static void main(String[] args) {
	 Voo v = new Voo();
	 Passageiro joao = new Passageiro(0, 1);
	 Passageiro maria = new Passageiro(0, 2);
	 v.adicionarPassageiros(joao, maria);
	 Passageiro mateus = new Passageiro(0, 2);
	 Passageiro marcos = new Passageiro(0, 2);
	 Passageiro pedro = new Passageiro(0, 0);
	 v.adicionarPassageiros(mateus, marcos, pedro);
}
}