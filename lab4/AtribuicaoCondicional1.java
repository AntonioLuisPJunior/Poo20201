package lab4;


public class AtribuicaoCondicional1 {
	
	public static void main(String[] args) {
		// atribuicao condicional
		int valor1 = 7;
        int valor2 = 5;
        // ternario  condicao ? true : false 
		int maiorValor = valor1 > valor2 ? valor1 : valor2; // 7 > 5 ? 7 : 5 //saida da 7

		System.out.println(maiorValor); // 7

		float alunos = 30;
		float salas = 4;
		float alunosPorSala= salas == 0.0f ? 0.0f : alunos/salas;
		// ternario  4 == 0.0f ? 0.0f : 30/4 saída 7.5
		System.out.println(alunosPorSala); // 7.5
	}

}