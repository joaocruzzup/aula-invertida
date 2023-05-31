//9 - Faça um Programa que leia 20 números e armazene-os numa lista. Armazene
//os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as
//três listas.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        List<Double> todosNumeros = new ArrayList<>();
        List<Double> numerosPar = new ArrayList<>();
        List<Double> numerosImpares = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        for(int i =1; i <=20;i++){
            System.out.println("Informe o "+i+"º número:");
            todosNumeros.add(entrada.nextDouble());
        }

        for(int i=0;i< todosNumeros.size();i++){
            if(todosNumeros.get(i)%2==0){
                numerosPar.add(todosNumeros.get(i));
            } else {
                numerosImpares.add(todosNumeros.get(i));
            }
        }

        System.out.println(todosNumeros);
        System.out.println(numerosPar);
        System.out.println(numerosImpares);
    }
}