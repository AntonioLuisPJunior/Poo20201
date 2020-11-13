package lab5;

public class MinhaClasse {

	void exibirSoma(float x, float y, int cont) {
		float soma = x + y;

		if (cont < 1)
			return;

		for (int i = 0; i < cont; i++)
			System.out.println(soma);
		
		return;
	}

	public static void main(String[] args) {
		MinhaClasse m = new MinhaClasse();
		m.exibirSoma(7.5f, 1.4f, 3);
		System.out.println("retornou");
	}
	
}
