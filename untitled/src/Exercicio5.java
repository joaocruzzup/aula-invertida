import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Faça um programa que imprima na tela apenas os números ímpares entre 1 e
        //50.

        System.out.println("---------------------------------------------------------");
        System.out.println("Boas-vindas ao impressor dos números impares entre 1 e 50");
        System.out.println("---------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        List<Integer> impares = new ArrayList<>();

        int i = 1;
        while (i <= 50){
            if ((i % 2) != 0){
                impares.add(i);
            }
            i++;
        }
        System.out.println("Os números ímpares entre 1 e 50 são: ");
        System.out.println(impares);

    }
}
