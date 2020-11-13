package labPoo;

public class MinhaClasse {
void exibirSoma(float x, float y, int cont) {
float soma = x + y;
for (int i = 0; i < cont; i++)
System.out.println(soma);
}
public static void main(String[] args) {
MinhaClasse m = new MinhaClasse();
m.exibirSoma(7.5f, 1.4f, 3);
}
}