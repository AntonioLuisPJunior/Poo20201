package prova;

class Automovel{
    private int velocidade;
    private String nome;
    private String fabricante;
    private int numeroCilindros;

    {
        velocidade = 30;
        nome = "Ka";
        fabricante = "Ford";
        numeroCilindros = 2;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroCilindros() {
        return numeroCilindros;
    }
    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}

public class CarroEsporte extends Automovel{
    public static void main(String[] args) {
        CarroEsporte carro = new CarroEsporte();
        System.out.println(carro.getVelocidade());
        System.out.println(carro.getFabricante());
        System.out.println(carro.getNome());
        System.out.println(carro.getNumeroCilindros());
    }
}
