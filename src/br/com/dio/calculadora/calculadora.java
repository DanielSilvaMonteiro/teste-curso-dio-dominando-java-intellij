package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

//ctrl + alt + v para adicionar variavel ex: subtrair(a,b) +ctrl+alt+v

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicacao = multiplicacao(a, b);
        double divisao = divisao(a, b);

        System.out.println("somar: "+somar);
        System.out.println("subt: "+subtrair);
        System.out.println("mult: "+multiplicacao);
        System.out.println("div: " +divisao);




    }
    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicacao (int a, int b){
        return a * b;
    }
    public static double divisao (double a, double b){
        return a / b;
    }
}
