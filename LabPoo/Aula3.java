package LabPoo;

public class Aula3 {
public static void main(String[] args) {
	int var;
	//System.out.println(var); //Erro
	var = 50;
	System.out.println(var); //50
	int outraVar = 100;
	System.out.println(outraVar); //100
	var = outraVar;
	System.out.println(var); //100
	outraVar = 200;
	System.out.println(outraVar); //200
	System.out.println(var); //100
}
}