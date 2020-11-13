package lab3;

public class Variaveis2 {
    
    public static void main(String[] args) {
        int variavel;
        // System.out.println(variavel); //print da erro pois executa uma variavel n inicializada       
        variavel = 50;
        System.out.println(variavel);
        
        int outraVariavel = 100;
        System.out.println(outraVariavel);
        
        variavel = outraVariavel; //atribuida por valor criando copia

        System.out.println(variavel); // exibe a cópia
        
        outraVariavel = 200; //permanece igual
        System.out.println(outraVariavel);
        

        System.out.println(variavel); // valor da copia
    }
}