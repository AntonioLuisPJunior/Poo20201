package labPoo;

public class Aula4_7 {
	public static void main(String[] args) {
		// matrizes
		float[] valores = new float[3];
		valores[0] = 10.0f;
		valores[1] = 20.0f;
		valores[2] = 15.0f;
		float soma = 0.0f;
		for(int i= 0; i< valores.length; i++)
		soma += valores[i];
		System.out.println(soma);
		}

}
