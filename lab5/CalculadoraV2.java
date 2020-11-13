// package lab5;

// public class CalculadoraV2 {

// 	public static void main(String[] args) {
		
// 		// v2
// 		EquacaoMatematica[] equacoes = new EquacaoMatematica[4];
// 		equacoes[0] = criar(100.0d, 50.0d, 'd');
// 		equacoes[1] = criar(25.0d, 92.0d, 'a');
// 		equacoes[2] = criar(225.0d, 17.0d, 's');
// 		equacoes[3] = criar(11.0d, 3.0d, 'm');

// 		for (EquacaoMatematica equacao : equacoes) {	// v2
// 			equacao.executar();							// v2
// 			System.out.print("resultado = ");
// 			//System.out.println(equacao.resultado);	// v2
// 			System.out.println(equacao.getResultado());	// v3
// 		}		
// 	}

// 	// v2
// 	public static EquacaoMatematica criar(double valorEsquerda, double valorDireita, char codigoOperacao) {
// 		EquacaoMatematica equacao = new EquacaoMatematica();
// 		equacao.valorEsquerda = valorEsquerda;
// 		equacao.valorDireita = valorDireita;
// 		equacao.codigoOperacao = codigoOperacao;

// 		// v3
// 		//equacao.setValorEsquerda(valorEsquerda);
// 		//equacao.setValorDireita(valorDireita);
// 		//equacao.setCodigoOperacao(codigoOperacao);		
		
// 		return equacao;
// 	}	
// }