import java.util.Random;
import java.util.Scanner;

public class java_p2 {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int sorte = r.nextInt(10) + 1;
        System.out.println("Adivinha o numero entre 1-10 ?");
        int numero = sc.nextInt();
        int x = 1;
        if (numero == sorte) {
            System.out.println("Parabéns, acertaste  à primeira.");
            System.out.println("O numero era o " + sorte);
        }
        if (numero != sorte) {
            do {
                
                x++;
                System.out.println("Azar, tente novamente!");
                numero = sc.nextInt();

            } while (numero != sorte);

            System.out.println("Parabéns, acertaste. Precisaste de " + x + " tentativas.");
            System.out.println("O numero era o " + sorte);
        }
    }
}
