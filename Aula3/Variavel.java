package Aula3;

public class Variavel {
    public static void main(String[] args) {

        int valor = 10;
        int resultado = 100;

        System.out.println(++valor);
        System.out.println(valor);
        System.out.println(valor++);
        System.out.println(valor);

        valor -= 5;
        System.out.println(valor);

        System.out.println("Formatado: " + String.format("%s, %s", valor, resultado));

        resultado /= valor * valor;
        System.out.println(resultado);
    }
    
}