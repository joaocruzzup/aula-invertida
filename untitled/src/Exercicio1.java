import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Olá! Vamos ajudar você a decidir qual produto comprar!");
        System.out.println("Levando em conta os preços e decidindo pelo mais barato, okay?");
        System.out.println("--------------------------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        List<Double> precos = new ArrayList<>();

        for (int i = 1; i < 4; i++){
            System.out.println("Informe o " + i + "º produto!");
            precos.add(entrada.nextDouble());
        }

        Collections.sort(precos);
        double menorPreco = precos.get(0);
        System.out.printf("O menor preço é o: %.2f",menorPreco);
    }
}
