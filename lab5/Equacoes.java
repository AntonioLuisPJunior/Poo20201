package lab5;

public class Equacoes {
    public double esquerda;
    public double direita;
    public double resultado;
    public char operacao;

    // public Equacoes(double esquerda, double direita, char operacao){
    //     this.esquerda = esquerda;
    //     this.direita = direita;
    //     this.operacao = operacao;
    // }

    public double getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(double esquerda) {
        this.esquerda = esquerda;
    }

    public double getDireita() {
        return direita;
    }
    public void setDireita(double direita) {
        this.direita = direita;
    }

    public char getOperacao() {
        return operacao;
    }
    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void executar(){
        switch (this.operacao) {
            case 'a':
                soma();
                break;
            case 's':
                subtracao();
                break;
            case 'd':
                divisao();
                break;
            case 'm':
                multiplicacao();
                break;
            default:
                System.out.println("erro - codigo de operacao invalido");
                setResultado(0);;
                break;
			}
    }

    public void soma(){
        this.resultado = this.esquerda + this.direita;
    }
    public void subtracao(){
        this.resultado = this.esquerda - this.direita;
    }
    public void multiplicacao(){
        this.resultado = this.esquerda * this.direita;
    }

    public void divisao(){
        if (this.esquerda != 0){
            this.resultado = this.esquerda / this.direita;
        }else{
            this.resultado = 0;
        }
    }
}

