import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = entrada.nextInt();

        System.out.println("Numeros no intervalo: ");
        for (int i = num1 + 1; i < num2; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

        if (numeros.size()==0){
            System.out.println("Nao existe intervalo");
        }
    }
}
