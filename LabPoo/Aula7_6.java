package labPoo;

public class EquacaoMatematica {
	public double valorEsquerda;
	public double valorDireita;
	//public char codigoOperacao;
	public char codigoOperacao = 'a'; // v7
	public double resultado;
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
	// v7
	public EquacaoMatematica() {}
	// v7
	public EquacaoMatematica(char codigoOperacao) {
	this.codigoOperacao = codigoOperacao;
	}
	// v7
	public EquacaoMatematica(char codigoOperacao, double valorEsquerda,
	double valorDireita) {
	this(codigoOperacao);
	this.valorEsquerda = valorEsquerda;
	this.valorDireita = valorDireita;
	}
	// v8
	public void executar(double valorEsquerda, double valorDireita) {
	this.valorEsquerda = valorEsquerda;
	this.valorDireita = valorDireita;
	executar();
}
	public void executar(int valorEsquerda, int valorDireita) {
		this.valorEsquerda = valorEsquerda;
		this.valorDireita = valorDireita;
		executar();
		resultado = (int) resultado;
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
		resultado = valorDireita != 0.0d ? valorEsquerda /
		valorDireita : 0.0d;;
		break;
		case 'm':
		resultado = valorEsquerda * valorDireita;
		break;
		default:
		System.out.println("erro: codigo operacao invalido");
		resultado = 0.0d;
		break;
		}}}

public class Aula7_6{
	public static void main(String[] args) {
	// v6
	EquacaoMatematica[] equacoes = new EquacaoMatematica[4];
	// v7
	equacoes[0] = new EquacaoMatematica('d', 100.0d, 50.0d);
	equacoes[1] = new EquacaoMatematica('a', 25.0d, 92.0d);
	equacoes[2] = new EquacaoMatematica('s', 225.0d, 17.0d);
	equacoes[3] = new EquacaoMatematica('m', 11.0d, 3.0d);
	// v6
	for (EquacaoMatematica equacao : equacoes) {
	equacao.executar();
	System.out.print("resultado = ");
	System.out.println(equacao.getResultado());
	}
	// v8
	System.out.println();
	System.out.println("usando sobrecarga");
	System.out.println();
	double valorEsquerda = 9.0d;
	double valorDireita = 4.0d;
	int inteiroEsquerda = 9;
	int inteiroDireita = 4;
	EquacaoMatematica equacaoComSobrecarga = new EquacaoMatematica('d');
	equacaoComSobrecarga.executar(valorEsquerda, valorDireita);
	System.out.print("resultado: ");
	System.out.println(equacaoComSobrecarga.getResultado());
	equacaoComSobrecarga.executar(inteiroEsquerda, inteiroDireita);
	System.out.print("resultado: ");
	System.out.println(equacaoComSobrecarga.getResultado());
	equacaoComSobrecarga.executar((double) inteiroEsquerda, inteiroDireita);
	System.out.print("resultado: ");
	System.out.println(equacaoComSobrecarga.getResultado());
	}
}