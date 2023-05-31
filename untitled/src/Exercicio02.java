//2 - Faça um Programa que leia um número e exiba o dia correspondente da
//semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor
//inválido.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] diaSemana = new String[7];

        diaSemana[0] = "Domingo";
        diaSemana[1] = "Segunda";
        diaSemana[2] = "Terça";
        diaSemana[3] = "Quarta";
        diaSemana[4] = "Quinta";
        diaSemana[5] = "Sexta";
        diaSemana[6] = "Sábado";

        System.out.println("Informe um número de 1 a 7 para verificar o dia da semana:");
        int numDia = entrada.nextInt();

        System.out.println(diaSemana[numDia -1]);

    }
}
