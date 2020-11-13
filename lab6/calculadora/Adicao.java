package lab6.calculadora;

public class Adicao extends Base{
    public Adicao(double x,double y){
        super(x, y);
    }
    
    @Override
    public void calcular(){
        double valor = getX() + getY();
        setResultado(valor);

    }
    
}
