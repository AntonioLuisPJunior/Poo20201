package lab4;


public class OperadoresLogicos2 {
	
	public static void main(String[] args) {
		// operador logico e vs operador logico condicional e
		int alunos = 150;
		int salas = 0;

        // if (salas > 0 & alunos/salas > 30) // isso da uma divisão por zero e com isso da err
        //     System.out.println("lotada!");
        if (salas > 1 && alunos/salas > 30) // avalia o primeiro fator e ignora o resto caso true
			System.out.println("lotada!");
		
		System.out.println();
		System.out.println("*** fim programa ***");			
	}

}