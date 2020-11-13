package lab5;

public class ProgramaVoo {
	
	public static void main(String[] args) {
		Voo2 voo1 = new Voo2();
		
		//System.out.println(voo1.passageiros);

		voo1.adicionarPassageiro();
		//voo1.tratarLotado();

		ProgramaVoo programaVoo = new ProgramaVoo();
		programaVoo.exibirSoma(7.5f, 1.4f, 3);

		//Voo2 voo1 = new Voo2();
		Voo2 voo2 = new Voo2();

		// adiciona passageiros a ambos os voos

		//Voo2 voo3;
		Voo2 voo3 = null;

		if(voo1.possuiEspaco(voo2))	
			voo3 = voo1.criarNovoComAmbos(voo2);

		// todo

		if (voo3 != null)
			System.out.println("voos combinados");

		// lb06
		Voo2 slzParaVcp= new Voo2();
		slzParaVcp.setPoltronas(150);
		System.out.println(slzParaVcp.getPoltronas());

	}

	void exibirSoma(float x, float y, int cont)
	{
		float soma = x + y;

		for (int i = 0; i < cont; i++)
			System.out.println(soma);
	}

}
