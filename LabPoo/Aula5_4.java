package labPoo;

public Voo2 criarNovoComAmbos(Voo2 v2) {
Voo2 novoVoo = new Voo2();
novoVoo.poltronas = poltronas;
novoVoo.passageiros = passageiros +
v2.passageiros;
return novoVoo;
}
...
Voo2 voo1 = new Voo2();
Voo2 voo2 = new Voo2();
// adiciona passageiros a ambos os voos
Voo2 voo3;
if (voo1.possuiEspaco(voo2))
voo3 = voo1.criarNovoComAmbos(voo2);