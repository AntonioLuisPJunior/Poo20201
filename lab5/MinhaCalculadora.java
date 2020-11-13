package lab5;

public class MinhaCalculadora {
    public static void main(String[] args) {
        // Equacoes equacao =  new Equacoes(esquerda, direita, operacao)
        Equacoes equacao =  new Equacoes();
        equacao.setEsquerda(10);
        equacao.setDireita(5);
        equacao.setOperacao('a');
        equacao.executar();
        System.out.println(equacao.getResultado());
    }
    
}
