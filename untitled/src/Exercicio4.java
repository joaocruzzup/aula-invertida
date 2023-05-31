//4 - Faça um programa que leia 5 números e informe o maior número.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        List<Double> numerosInformados = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Veja qual o maior número de 5 números informados.");
        for (int i = 1;i<=5;i++){

            System.out.println("Informe o "+i+"º número:");
            numerosInformados.add(entrada.nextDouble());
        }

        double maiorValor =0;

        for(int i = 0; i < numerosInformados.size();i++){
            if(numerosInformados.get(i) > maiorValor){
                maiorValor = numerosInformados.get(i);
            }
        }

        System.out.println(maiorValor);
    }
}