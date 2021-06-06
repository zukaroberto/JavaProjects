import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class repetir {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Continuar continuar = new Continuar ("Queres jogar outra vez?");
        do {
            System.out.println("Insere um nummero ");
            int num = sc.nextInt();
            if (num % 2 ==0)
            System.out.println ("O número "+num+ " é par");
            else
            System.out.println ("O número "+num+ " é impar");
        } while (continuar.perguntar());
    }

}
