package lab4;

public class OperadoresLogicos1 {
	
	public static void main(String[] args) {
		// operadores logicos
		int a = 20, b = 14, c = 5;
		
		if (a > b & b > c)// (20 > 14 = true e 14 > 5 = true) = true
			System.out.println("a eh maior que c");

		boolean pronto = false;
		
		if (!pronto)
			System.out.println("continue...");
	}

}