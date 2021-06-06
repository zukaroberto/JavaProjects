import java.util.Scanner;

public class parornot {
    public static void main(String[] args) throws Exception {
        Continuar continuar = new Continuar ("Repetir?");
        Scanner sc = new Scanner(System.in);
        int numero;
do{
        do {
            System.out.println("Insira um número entre 1 e 100");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 100);
        if (numero % 2 == 0)
            System.out.println("O número " + numero + " é par");
        else
            System.out.println("O número " + numero + " é impar");
}while(continuar.perguntar());
}
}
