package lab6.calculadora;

public class Multiplicacao extends Base{
    public Multiplicacao(double x,double y){
        super(x, y);
    }

    @Override
    public void calcular(){
        double valor = getX() * getY();
        setResultado(valor);

    }
    
}
