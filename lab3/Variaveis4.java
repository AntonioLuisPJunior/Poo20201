package lab3;

public class Variaveis4 {
    public static void main(String[] args) {
        // tipos primitivos sao armazenados por valor
        int primeiroValor= 100;
        int outroValor= primeiroValor;
        primeiroValor= 50;
        System.out.println(String.format("%s, %s", primeiroValor, outroValor));
    }
}
