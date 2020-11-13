package labPoo;

public class Aula3_8 {
	public static void main(String[] args) {
		// precedencia de operadores
		int valorA = 21;
		int valorB = 6;
		int valorC = 3;
		int valorD = 1;
		int resultado1 = valorA - valorB / valorC;
		int resultado2 = (valorA - valorB) / valorC;
		System.out.println(resultado1); // 19
		System.out.println(resultado2); // 5
		int resultado3 = valorA / valorC * valorD + valorB;
		int resultado4 = valorA / (valorC * (valorD + valorB));
		System.out.println(resultado3); // 13
		System.out.println(resultado4); // 1
		int resultado5 = valorD + --valorC * valorB++;
		System.out.println(resultado5); // 13
		}
}
