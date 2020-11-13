package lab4;

public class Matrizes1 {
	
	public static void main(String[] args) {
		// matrizes
		float[] valores = new float[3];
		//valores[0] = 10.0f;
		//valores[1] = 20.0f;
		//valores[2] = 15.0f;

		// float[] valores = { 10.0f, 20.0f, 15.0f};
		// float[] valores = [ 10.0f, 20.0f, 15.0f]; //errado

		float soma = 0.0f;

		for(int i= 0; i< valores.length; i++)
            soma += valores[i];
        System.out.println(soma);

        float somaLinha = 0.0f;
        
        float[][] valores2 = new float[3][3];
		for(int i= 0; i < valores2.length; i++){
            for(int j= 0; j < valores2[0].length;j++){
                somaLinha += valores2[i][j];
                System.out.print(valores2[i][j] + "\t");
            }
            System.out.println("somaLinha = " + somaLinha);
			somaLinha = 0.0f;
        }
        float[] valores3 = { 10.0f, 20.0f, 15.0f, 25.0f, 1.0f, 2.0f, 5.0f, 100.0f, 80.0f, 35.0f, 50.0f, 10.0f };
		float maior = 0;
        for(float valorAtual : valores3) {
            if(valorAtual < maior){
                continue;
            }
            maior = valorAtual;
        }
        System.out.println(" o maior: " + maior);
        float valorProcurado = 35.0f;
        for(float valorAtual : valores3) {
            if(valorAtual == valorProcurado){
                System.out.println(" foi encontrado o: " + valorProcurado);
                break;
            }
        }
	}

}