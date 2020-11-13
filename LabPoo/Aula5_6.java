package labPoo;

public class Aula5_6 {
	public static void main(String[] args) {
		// v2
		EquacaoMatematica[] equacoes = new EquacaoMatematica[4];
		equacoes[0] = criar(100.0d, 50.0d, 'd’);
		equacoes[1] = criar(25.0d, 92.0d, 'a’);
		equacoes[2] = criar(225.0d, 17.0d, 's’);
		equacoes[3] = criar(11.0d, 3.0d, 'm');
		for (EquacaoMatematica equacao : equacoes) { // v2
		equacao.executar(); // v2
		System.out.print("resultado = ");
		System.out.println(equacao.getResultado()); // v3
		}
		}
		// v2
		public static EquacaoMatematica criar(double valorEsquerda,
		double valorDireita, char codigoOperacao) {
		EquacaoMatematica equacao = new EquacaoMatematica();
		// v3
		equacao.setValorEsquerda(valorEsquerda);
		equacao.setValorDireita(valorDireita);
		equacao.setCodigoOperacao(codigoOperacao);
		return equacao;
		} 
}

public class EquacaoMatematica {
private double valorEsquerda;
private double valorDireita;
private char codigoOperacao;
private double resultado;
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
