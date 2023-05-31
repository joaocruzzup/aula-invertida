//11 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para
//controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
//peixes maior que o estabelecido pelo regulamento de pesca do estado de São
//Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João
//precisa que você faça um programa que leia a variável peso (peso de peixes) e
//calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
//limite e na variável multa o valor da multa que João deverá pagar. Imprima os
//dados do programa com as mensagens adequadas.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        List<Double> kilosPeixes = new ArrayList<>();

        System.out.println("Informe o peso de peixes pescados:");
        kilosPeixes.add(entrada.nextDouble());

        if(kilosPeixes.get(0)>50){
            double excesso = kilosPeixes.get(0) - 50;
            double multa = excesso * 4;
            System.out.println("O excesso de peso é: "  + excesso);
            System.out.printf("O valor da multa pelo excesso de peso é R$%.2f." , multa);
        } else {
            System.out.println("Não há multa, peso de peixes dentro do permitido.");
        }
    }
}
