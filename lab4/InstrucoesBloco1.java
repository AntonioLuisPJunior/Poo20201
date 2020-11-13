package lab4;

public class InstrucoesBloco1 {
	
	public static void main(String[] args) {
		// instrucoes de bloco
		int valor1 = 10, valor2 = 4, diff;

		if (valor1 > valor2) // 10 > 4 = true 
		 {
			diff = valor1 - valor2; // dif = 10 - 4 = 6
		
			System.out.println("valor1 eh maior");
			System.out.println(diff); 
		} else if (valor2 > valor1) // 4 > 10 = false 
		{
			diff = valor2 - valor1;
			
			System.out.println("valor2 eh maior");
			System.out.println(diff);
		} else // caso 10 > 4 ou 4 > 10 nao passarem
			System.out.println("valor1 e valor2 sao iguais");
	}

}