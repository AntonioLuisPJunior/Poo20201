package lab3;

public class Variaveis7 {
    public static void main(String[] args) {
        // precedencia de operadores
        int valorA = 21;
        int valorB = 6;
        int valorC = 3;
        int valorD = 1;
        int resultado1 = valorA - valorB / valorC; // 21 - 6/3 = 19
        int resultado2 = (valorA - valorB) / valorC; //(21-6)/3 = 5
        System.out.println(resultado1); // 19 
        System.out.println(resultado2); // 5
        int resultado3 = valorA / valorC * valorD + valorB; // 21/3 * 1 + 6 = 13
        int resultado4 = valorA / (valorC * (valorD + valorB)); // 21 / ( 3 * (1+6)) = 1
        System.out.println(resultado3); // 13
        System.out.println(resultado4); // 1
        int resultado5 = valorD + --valorC * valorB++; //  1 + (3-1) * (6) // no fim valorc vale 2 e valor b vale 7
        System.out.println(resultado5); // 13
        System.out.println(valorC); // 2
        System.out.println(valorB); // 7
        
    }
    
}
