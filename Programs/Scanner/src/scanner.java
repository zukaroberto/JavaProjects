import java.util.Random;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws Exception {
        int[] compras = new int[15];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome ?");
        String nome = sc.nextLine();
        System.out.println("Idade ?");
        int idade = sc.nextInt();
        System.out.println("peso ?");
        int peso = sc.nextInt();
        System.out.println("altura ?");
        int altura = sc.nextInt();
        System.out.println("O nome é " + nome + " , a idade é " + idade + " , peso é " + peso + " kg e a altura é "
                + altura + " cm");
        System.out.println("mes ?");
        int mes = sc.nextInt();
        switch (mes) {
        case 1:
            System.out.println("janeiro");
            break;
        case 2:
            System.out.println("fevereiro");
            break;
        case 3:
            System.out.println("Março");
            break;
        case 4:
            System.out.println("Abril");
            break;
        case 5:
            System.out.println("Maio");
            break;
        case 6:
            System.out.println("junho");
            break;
        case 7:
            System.out.println("julho");
            break;
        case 8:
            System.out.println("agosto");
            break;
        case 9:
            System.out.println("Setembro");
            break;
        }
    }
}
