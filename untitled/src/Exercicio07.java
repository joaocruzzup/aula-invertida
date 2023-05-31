import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("Digite 5 números inteiros");

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o %dª número: ", (i + 1));
            numeros.add(sc.nextInt());
        }
        System.out.println("Os números digitados foram: ");
        System.out.println(numeros);

    }
}
