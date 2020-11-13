package lab6;

public final class Passageiro {
	
	// campos & metodos removidos para clareza
	
	int bagagensVerificadas = 0;
	int bagagemGratis = 0;

	public int getBagagensVerificadas() {
		return this.bagagensVerificadas;
	}

	public Passageiro() {
	}

	public Passageiro(int bagagemGratis) {
		this.bagagemGratis = bagagemGratis;
	}

	public Passageiro(int bagagemGratis, int bagagensVerificadas) {
		this(bagagemGratis);
		this.bagagensVerificadas = bagagensVerificadas;
	}

}
