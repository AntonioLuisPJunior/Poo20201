package labPoo;

public class Aula8_3 {
	public static void main(String[] args) {
		// v9
		System.out.println();
		System.out.println("usando heranca");
		System.out.println();
		CalculoBase[] calculadoras = {
		new Divisao(100.0d, 50.0d),
		new Adicao(25.0d, 92.0d),
		new Subtracao(225.0d, 17.0d),
		new Multiplicacao(11.0d, 3.0d),
		};
		for (CalculoBase calculadora : calculadoras) {
		calculadora.calcular();
		System.out.print("resultado: ");
		System.out.println(calculadora.getResultado());
		}
		}
}

public abstract class CalculoBase {
private double valorEsquerda;
private double valorDireita;
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
public double getResultado() {
return resultado;
}
public void setResultado(double resultado) {
this.resultado = resultado;
}

public CalculoBase() { }
public CalculoBase(double valorEsquerda, double valorDireita) {
this.valorEsquerda = valorEsquerda;
this.valorDireita = valorDireita;
}
public abstract void calcular();
}

public class Adicao extends CalculoBase {
public Adicao() { }
public Adicao(double valorEsquerda, double valorDireita) {
super(valorEsquerda, valorDireita);
}
@Override
public void calcular() {
double valor = getValorEsquerda() + getValorDireita();
setResultado(valor);
}
}

public class Subtracao extends CalculoBase {
public Subtracao() { }
public Subtracao(double valorEsquerda, double valorDireita) {
super(valorEsquerda, valorDireita);
}
@Override
public void calcular() {
double valor = getValorEsquerda() - getValorDireita();
setResultado(valor);
}
}

public class Divisao extends CalculoBase {
public Divisao() { }
public Divisao(double valorEsquerda, double valorDireita) {
super(valorEsquerda, valorDireita);
}
@Override
public void calcular() {
double valor = getValorEsquerda() / getValorDireita();
setResultado(valor);
}
}

public class Multiplicacao extends CalculoBase {
public Multiplicacao() { }
public Multiplicacao(double valorEsquerda, double valorDireita) {
super(valorEsquerda, valorDireita);
}
@Override
public void calcular() {
double valor = getValorEsquerda() * getValorDireita();
setResultado(valor);
}
}