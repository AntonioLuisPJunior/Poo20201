package lab6.calculadora;

public abstract class Base {
    private double x;
    private double y;
    private double resultado;

    {
        resultado = 0;
    }
    public Base(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getResultado() {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public abstract void calcular();

}
