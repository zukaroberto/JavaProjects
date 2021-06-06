
import java.util.Scanner;

public class par_impar_primos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Continuar continuar = new Continuar ("Repetir?");
        do {
            System.out.println("Insere um nummero ");
            int numero = sc.nextInt();
            if (numero % 2 ==0)
            System.out.println ("O número "+numero+ " é par");
            else
            System.out.println ("O número "+numero+ " é impar");
            boolean primo = true;
            for (int a = 2; a <= numero; a++) {
                if ( ( (numero % a) == 0) && (a != numero) ) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println( "É primo" );
            } else {
                System.out.println("Não é primo");
            }
        
        } while (continuar.perguntar());
    }

}
