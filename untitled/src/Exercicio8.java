import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números");
        List<Double> lista_numeros = new ArrayList<>();
        List<Double> lista_inversa = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o %dªnúmero: ", (i + 1));
            lista_numeros.add(sc.nextDouble());
        }

        int n = lista_numeros.size();
        for (int i = n -1; i >= 0; i--){
            lista_inversa.add(lista_numeros.get(i));

        }
        System.out.println("Os números digitados na ordem reversa são: ");
        System.out.println(lista_inversa);
    }
}
