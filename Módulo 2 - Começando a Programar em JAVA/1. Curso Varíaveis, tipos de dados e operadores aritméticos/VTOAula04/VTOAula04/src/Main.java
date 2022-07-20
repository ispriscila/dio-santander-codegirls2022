/**
 * Classe de exemplo para o exercício da Aula 4 de Variáveis, Tipos de Dado e Operadores aritméticos.
 * cuidado com downcast, sempre explícito, ele pode truncar valor fracionado p inteiro,
 * ocasionar perda de informação
 * já downcast sobra espaço, então é implícito
 */
public class Main {

    public static void main(String[] args) {
        int i = 3;
        System.out.println(10 - 5 * 2 + --i);

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // conversão de short p byte, downcast, reduzindo, ocasiona perda de informação

        long l1;
        int i1 = 10; // upcast, sem perda de informação, promoção,
        l1 = i1;

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // downcast

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // ex downcast mas sem perda de informação

        double d1;
        float f1 = 10.5f;
        d1 = f1; // upcast

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; // downcast sem perda de informação
        double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; // downcast perda

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4; // classico de truncar o valor, ignorando a parte fracionaria, downcast

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i4:" + i4);

        b1 = (byte) d3; // downcast

        System.out.println("b1:" + b1);

    }
}