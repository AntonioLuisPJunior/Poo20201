package lab5;

public class EquacaoMatematica {
	
	//public double valorEsquerda;
	//public double valorDireita;
	//public char codigoOperacao;
	//public double resultado;

	private double valorEsquerda;
	private double valorDireita;
	private char codigoOperacao;
	private double resultado;	

	// v3
	public double getValorEsquerda() {
		return valorEsquerda;
	}

	public void setValorEsquerda(double valorEsquerda) {
		this.valorEsquerda = valorEsquerda;
	}

	public double getValorDireita() {
		return valorDireita;
	}
	
	public void setValorDireita(double valorDireita) {
		this.valorDireita = valorDireita;
	}

	public char getCodigoOperacao() {
		return codigoOperacao;
	}
	public void setCodigoOperacao(char codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}

	public double getResultado() { 
		return resultado;
	}

	public void executar() {
		switch (codigoOperacao) {
			case 'a':
				resultado = valorEsquerda + valorDireita;

				break;

			case 's':
				resultado = valorEsquerda - valorDireita;
				
				break;

			case 'd':
				resultado = valorDireita != 0.0d ? valorEsquerda / valorDireita : 0.0d;;

				break;

			case 'm':
				resultado = valorEsquerda * valorDireita;

				break;

			default:
				System.out.println("erro: codigo operacao invalido");
				resultado = 0.0d;

				break;
		}
	}
}

