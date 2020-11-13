package lab6.calculadora;

public class Divisao extends Base{
    public Divisao(double x,double y){
        super(x, y);
    }

    @Override
    public void calcular(){
        if (getY() <= 0){
            return;
        }
        double valor = getX() / getY();
        setResultado(valor);
    }
    
}
