package Aula4;

public class OperadoresLogicos {
    public static void main(String[] args) {
		// operadores logicos
		int a = 20, b = 14, c = 5;
		
		if (a > b & b > c)
            System.out.println("A É MAIOR QUE C");
        if (b > a & b > c)
            System.out.println("B É MAIOR QUE C");
        else
            System.out.println("B É MENOR QUE A");

        if (b > a || b < c)
            System.out.println("B É MENOR QUE C OU B É MAIOR QUE A");
        else
            System.out.println("B É MENOR QUE A E B É MAIOR QUE C");
		boolean pronto = false;
		
		if (!pronto)
			System.out.println("continue...");
	}
}
