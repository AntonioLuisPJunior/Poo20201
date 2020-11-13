// package lab5;

// public class Voo3novo {

// 	// outros membros removidos para clareza
	
// 	int poltronas = 150, passageiros;
// 	int totalBagagensVerificadas;
// 	int maximoBagagensDeMao = poltronas * 2, totalBagagensDeMao;

// 	public void adicionar1Passageiro() {
// 		if (verificarPoltronaDisponivel())
// 			passageiros += 1;
// 		else
// 			tratarLotado();
// 	}

// 	public void adicionar1Passageiro(int bagagens) {
// 		if (verificarPoltronaDisponivel()) {
// 			adicionar1Passageiro();
// 			totalBagagensVerificadas += bagagens;
// 		}
// 	}

// 	public void adicionar1Passageiro(Passageiro p) {
// 		adicionar1Passageiro(p.getBagagensVerificadas());
// 	}

// 	public void adicionar1Passageiro(int bagagens, int bagagensDeMao) {
// 		if (verificarPoltronaDisponivel() && verificarEspacoNoBagageiro(bagagensDeMao)) {
// 			adicionar1Passageiro(bagagens());
// 			totalBagagensDeMao += bagagensDeMao;
// 		}
// 	}

// 	public void adicionar1Passageiro(Passageiro p, int bagagensDeMao) {
// 		adicionar1Passageiro(p.getBagagensVerificadas(), bagagensDeMao);
// 	}	

// 	public boolean verificarPoltronaDisponivel() {
// 		return passageiros < poltronas;
// 	}

// 	public boolean verificarEspacoNoBagageiro(int bagagensDeMao) {
// 		return totalBagagensDeMao + bagagensDeMao <=  maximoBagagensDeMao;
// 	}

// 	public static void main() {

// 		Voo3novo v = new Voo3novo();
		
// 		Passageiro p1 = new Passageiro(0, 1);
// 		Passageiro p2 = new Passageiro(0, 2);
		
// 		v.adicionar1Passageiro();
// 		v.adicionar1Passageiro(2);
// 		v.adicionar1Passageiro(p1);

// 		short tresMalas= 3;

// 		v.adicionar1Passageiro(tresMalas, 2);
// 		v.adicionar1Passageiro(p2, 1);
// 	}
// }