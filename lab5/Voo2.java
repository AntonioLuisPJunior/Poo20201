package lab5;

public class Voo2 {
	
    private int passageiros;
   private int poltronas;

   // lab 06
   public int getPoltronas() {
       return poltronas;
   }
   
   public void setPoltronas(int poltronas) {
       this.poltronas = poltronas;
   }

   public Voo2() {
       passageiros = 0;
       poltronas = 150;
   }

   public void adicionarPassageiro() {
       if(passageiros < poltronas) {
           passageiros += 1;
       } else {
           tratarLotado();
       }
   }

   private void tratarLotado() {
       System.out.println("lotado");
   }

   public boolean possuiEspaco(Voo2 v2) {
       
       int total = this.passageiros + v2.passageiros;

       if (total <= poltronas)
           return true;
       else
           return false;

       //return (total <= poltronas);
   }

   public Voo2 criarNovoComAmbos(Voo2 v2) {
       Voo2 novoVoo = new Voo2();

       novoVoo.poltronas = poltronas;
       novoVoo.passageiros = passageiros + v2.passageiros;

       return novoVoo;
   }

}
