package lab5;

public class Terra {
	
	// inicializacao de campos
	//long circunferenciaEmMilhas;

	// atribuicao simples
	long circunferenciaEmMilhas = 24901;

	// equacao
	//long circunferenciaEmQuilometros = 24901 * 1.6d;
	//long circunferenciaEmQuilometros = (long) (24901 * 1.6d); // equacao valida, 24901 duplicado
	
	// outros campos
	// equacao valida, (circunferenciaEmMilhas * 1.6d) =  39841.6
	// com a conversao para long ocorre truncamento = 39841, perda de precisao
	//long circunferenciaEmQuilometros = (long) (circunferenciaEmMilhas * 1.6d); 

	// chamada de metodo
	long circunferenciaEmQuilometros = Math.round(circunferenciaEmMilhas * 1.6d); // 39842

	public static void main(String[] args) {
		Terra terra = new Terra();
		System.out.println(terra.circunferenciaEmMilhas);
		System.out.println(terra.circunferenciaEmQuilometros);
	}

}
