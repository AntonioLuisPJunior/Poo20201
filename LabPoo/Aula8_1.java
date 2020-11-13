package labPoo;

public class Aula8_1{
	public static void main(String[] args) {
		// v5
		Voo v1 = new Voo();
		System.out.println(v1.getPoltronas()); // 150
		VooCarga vc= new VooCarga();
		System.out.println(vc.getPoltronas()); // 12
		Voo v2 = new VooCarga();
		System.out.println(v2.getPoltronas()); // 12
		v2.adicionar1Passageiro();
		vc.adicionar1Passageiro();

	}
}

public class VooCarga extends Voo {
	// outros membros removidos para clareza
	int poltronas = 12;
	@Override
	int getPoltronas() { return 12; }
	}
	public class Voo {
	// outros membros removidos para clareza
	int poltronas = 150, passageiros;
	int getPoltronas() { return 150; }
	public void adicionar1Passageiro() {
	if (verificarPoltronaDisponivel())
	passageiros += 1;
	else {
	//tratarLotado();
	}
	}
	public boolean verificarPoltronaDisponivel() {
	return passageiros < getPoltronas();
	}
	}