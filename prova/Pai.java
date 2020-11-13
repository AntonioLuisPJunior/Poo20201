package prova;

class Filho{   
    private String variavel;
    {
        variavel = "oba";
    }
    private void metodo(){
        System.out.print("oba");
    }
}

public class Pai extends Filho {
    public static void main(String[] args) {
        Pai pai = new Pai();
        // pai.metodo();// dá erro de visibilidade no metodo  
        // System.out.println(pai.variavel);// dá erro de visibilidade na variavel
    }
}
