package lab6.calculadora;

public class Subtracao extends Base{
    public Subtracao(double x,double y){
        super(x, y);
    }

    @Override
    public void calcular(){
        double valor = getX() - getY();
        setResultado(valor);

    }
    
}
