package labPoo;

public class Aula8_2 {

}

public abstract class Piloto {
private Voo vooAtual;
public void voar(Voo v) {
if (aceitar(v))
vooAtual = v;
else
tratarAceitacao();
}
public abstract boolean aceitar(Voo v);
private void tratarAceitacao() {
System.out.println("nao pode aceitar");
}
}

public class PilotoCarga extends Piloto {
@Override
public boolean aceitar(Voo v) {
return v.getPassageiros() == 0;
}
}
public class PilotoLicencaTotal extends Piloto {
@Override
public boolean aceitar(Voo v) {
return true;
}
}