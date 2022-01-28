package com.dio.bootcamp;

/*
 *   Class criada para o exercício da Aula 1 de Variáveis, Tipos de Dados e Operadores Matemáticos
 *   Aula 02 adicionada ao método main
 *   Aula 03 adicionada ao método main
 *   Aula 04 adicionada ao método main
 *
 *   Separando as aulas em métodos distintos
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercícios da Aula 01");
        aula01();
        System.out.println("Exercícios da Aula 02");
        aula02();
        System.out.println("Exercícios da Aula 03");
        aula03();
        System.out.println("Exercícios da Aula 04");
        aula04();

    }

    private static void aula01() {

        // Exercícios da Aula 01

        int i;
        //int i;
        int I;
        //int 1i;
        int _1ia;
        int $aq;

        i = 5;
        I = 10;
        _1ia = 20;
        $aq = 7;

        final int J = 10;
        //J = 15;
        int asrn24678md;
        //int asrn2467 8md;
        int asrn2$4678_md;
        //int asrn2$46%78_md;

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadedeProduto = 50;
        //int QuantidadedeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //final int numero_tentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        //int qntdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1ia);
        System.out.println($aq);

        System.out.println(J);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadedeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }

    private static void aula02() {

        // Exercício Aula 02

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;

        //int i11 = -100000000000;
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5;
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84D;

        char c1 = 'W';
        //char c2 = 'Tw';
        char c3 = '\u0057';
        char c4 = '\u0013';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "as asd modmsod 2 2 o sd q sd,sdml ";

        //String dt1 = "26/01/1987";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
        System.out.println(c4);
        System.out.println(st1 + c4 + st2);

    }

    private static void aula03(){

        // Exercícios Aula 03

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritiméticos");
        aritimetico();
        System.out.println("Atribuição");
        atribuicoes();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);

    }

    private static void aritimetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a+b = " + r1);
        System.out.println("c-a = " + r2);
        System.out.println("d*b = " + r3);
        System.out.println("e/a = " + r4);
        System.out.println("c%b = " + r5);

    }

    private static void atribuicoes() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d = " + d);

        i += 5; // i = i + 5
        j -= 3; // j = j -3
        d /= 2.7d; //d = d /2.7d
        l *= 3; //l = l * 3
        k %= 2; //k = k % 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        i = k = j;

        System.out.println("k = " + k);
        System.out.println("i = " + i);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k = " + a);
        System.out.println("i = " + i); //11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1 = " + b);
        System.out.println("i = " + i); //10

        int c = 2;
        c *= i += 5; //c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5 -> c = 2 * 15 -> c = 30
        System.out.println("c *= i += 5 = " + c);

    }
    private static void aula04(){

        //Exercícios Aula 04

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1 = " + b1);
        System.out.println("l1 = " + l1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("d1 = " + d1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("i4 = " + i4);

        b1 = (byte) d3;

        System.out.println("b1 = " + b1);

    }

}
