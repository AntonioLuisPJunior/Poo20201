package lab4;
public class InstrucaoCondicional1 {
	
	public static void main(String[] args) {
		// instrucao if-else
		int valor1 = 10;
		int valor2 = 4;
		
		if (valor1 > valor2) // 10 > 4 = true
			System.out.println("valor1 eh maior");
		else
			System.out.println("valor1 nao eh maior");

		valor1 = 10;
		valor2 = 40;

		if (valor1 > valor2) // 10 > 40  = false
			System.out.println("valor1 eh maior");
		else if (valor1 < valor2) // 10 < 40  = true
			System.out.println("valor2 eh maior");
		else // situação se não for  10 > 40 ou 10 < 40 
			System.out.println("valor1 e valor2 sao iguais");

	}

}