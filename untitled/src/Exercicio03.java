import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
        //número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
        //a tabuada. A saída deve ser conforme o exemplo abaixo:
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("----------------------------");
        System.out.println("Boas-vindas a Tabuada Online");
        System.out.println("----------------------------");
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.printf("%nTabuada de %d: %n", num);
        for (int i = 1; i <= 10; i++){
            numeros.add(num * i);
            System.out.printf("%d x %d = %d %n", num, i, numeros.get(i - 1));
        }



    }
}