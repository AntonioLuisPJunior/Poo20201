package lab5;

public class ImutabilidadeParametros  {

	static void trocar(int i, int j) {
		int k = i;
		i = j;
		j = k;

		// print i & j
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		int val1 = 10;
		int val2 = 20;
		
		// print val1 & val2\
		System.out.println(val1  + " " + val2);
		
		trocar(val1, val2);
		
		// print val1 & val2
		System.out.println(val1  + " " + val2);
	}

}