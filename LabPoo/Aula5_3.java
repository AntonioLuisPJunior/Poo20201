package labPoo;

//voo2.java
public class Voo2 {
private int passageiros;
private int poltronas;
...
public boolean possuiEspaco(Voo2 v2) {
int total = passageiros + v2.passageiros;
if (total <= poltronas)
return true;
else
return false;
//return (total <= poltronas);
}
}