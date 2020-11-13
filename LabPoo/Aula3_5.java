package labPoo;

public class Aula3_5 {
	public static void main(String[] args) {
		// tipos primitivos sao armazenados por valor
		int primeiroValor= 100;
		int outroValor= primeiroValor;
		primeiroValor= 50;
		System.out.println(String.format("%s, %s", primeiroValor, outroValor));
	}
}
