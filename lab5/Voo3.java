package lab5;

public class Voo3 {

    int poltronas;
    int passageiros;

    Voo3(){
        passageiros = 0;
        poltronas = 150;
    }

    void adicionaPassageiros(){
        if (passageiros < poltronas) {
            passageiros ++;
        }
    }
    
    void adicionaPassageiros(int quantidade){
        if (passageiros < poltronas) {
            passageiros += quantidade;
        }
    }

    public static void main(String[] args) {
        Voo3 voo1 = new Voo3();
        Voo3 voo2 = new Voo3();
        voo1.adicionaPassageiros();
        System.out.print(voo1.passageiros);
        voo2.adicionaPassageiros(2);
        System.out.print(voo2.passageiros);
        voo1 = voo2;
        System.out.print(voo1.passageiros);

    }
    
}
