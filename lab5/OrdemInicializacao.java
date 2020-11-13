package lab5;

public class OrdemInicializacao {
	
	private int campo = 1;

	public int getCampo() {
		return campo;
	}

	{
		campo = 2;
	}

	public OrdemInicializacao() {
		campo = 3;
	}

	public static void main(String[] args) {
		OrdemInicializacao ordemInicializacao = new OrdemInicializacao();
		System.out.println(ordemInicializacao.getCampo());
	}

}
