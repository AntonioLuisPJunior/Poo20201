package Aula4;

class Variavel4 {
    public static void main(String[] args) {
        // conversão de tipo

        float valorFloat = 1.0f;
        double valorDouble = 4.0d;
        byte valorByte = 7;
        short valorShort = 300;
        long valorLong = 999999999;
        int valorInt = 50;

        System.out.println("Float : " + valorFloat);
        System.out.println("Double : " + valorDouble);
        System.out.println("Byte : " + valorByte);
        System.out.println("Short : " + valorShort);
        System.out.println("Long : " + valorLong);

        short Resultado1 = (short) valorByte;
        short Resultado2 = (short) (valorByte - valorLong);
        double Resultado3 = valorLong - valorDouble;
        byte Resultado4 = (byte) valorShort;
        short Resultado5 = (short) valorDouble;


        System.out.println("Resultado 1 :" + Resultado1);
        System.out.println("Resultado 2 :" + Resultado2);
        System.out.println("Resultado 3 :" + Resultado3);
        System.out.println("Resultado 4 :" + Resultado4);
        System.out.println("Resultado 5 :" + Resultado5);
    }
  }