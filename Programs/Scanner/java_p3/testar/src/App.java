import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] numeros = new int[5];
        int[] estrelas = new int[2];
        int z = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas apostas ?");
        int n_apostas = sc.nextInt();
        do {
            do{
                System.out.println("Qual o numero ?(1-50)");
                int numero = sc.nextInt();
            if (numeros[x] < 1 && numeros[x] > 51){
            for (x=0; x < numeros.length; x++) {


            if (numeros[x] < 1 && numeros[x] > 51){
                System.out.println("introduziu um numero invalido, Introduzir entre 1-50:");
                numeros[x] = sc.nextInt();
            }
            }
            System.out.println(" ");
            for (x=0; x < estrelas.length; x++) {
                System.out.println("Qual o numero da estrela ?(1-10)");
                estrelas[x] = sc.nextInt();
                if (numeros[x] < 1 && numeros[x] > 11){
                    System.out.println("introduziu um numero invalido, Introduzir entre 1-10:");
                    numeros[x] = sc.nextInt();
                }
            }

            int troquei = 0;
            do {
                x = 0;
                troquei = 0;

                do {
                    if (numeros[x] > numeros[x + 1]) {
                        int t = numeros[x];
                        numeros[x] = numeros[x + 1];
                        numeros[x + 1] = t;
                        troquei = 1;
                    }
                } while (++x < numeros.length - 1);
            } while (troquei == 1);
            x = 0;
            do {

                if (estrelas[x] > estrelas[x + 1]) {
                    int t = estrelas[x];
                    estrelas[x] = estrelas[x + 1];
                    estrelas[x + 1] = t;
                }
            } while (++x < estrelas.length - 1);
            for (x = 0; x < numeros.length; x++) {
                System.out.print(numeros[x] + "\t");
            }
            for (x = 0; x < estrelas.length; x++) {
                System.out.print(" | " + estrelas[x] + " | " + "\t");

            }
            z++;
        } while (z < n_apostas);
    }
}
