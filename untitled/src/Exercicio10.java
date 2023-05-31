import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            System.out.printf("Digite o %dª número: ", (i ));
            numeros.add(sc.nextDouble());
        }
        double soma = 0;
        double mult = 1;
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(i);
            soma += numeros.get(i);
            mult *= numeros.get(i);
        }

        System.out.printf("A soma é: %.2f %n", soma);
        System.out.printf("A multiplicação é: %.2f", mult);
    }
}
