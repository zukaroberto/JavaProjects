
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
            int[] compras = new int[15];
            Random r = new Random();
    
            int y = 0;
            do {
    
                int numero = r.nextInt(15) + 1;
                int x = 0;
                for (; x < compras.length; x++) {
                    if (numero == compras[x]) {
    
                        break;
                    }
                }
                if (x == compras.length)
                    compras[y++] = numero;
            } while (y < compras.length);
    
            for (int x = 0; x < compras.length; x++) {
                System.out.print(compras[x] + "\t");
            }
    
            int troquei = 0;
            do {
                int x = 0;
                troquei = 0;
                System.out.println("Fora");
    
                do {
                    System.out.println("Dentro fora do if");
                    if (compras[x] > compras[x + 1]) {
                        System.out.println("Dentro dentro do if");
                        int t = compras[x];
                        compras[x] = compras[x + 1];
                        compras[x + 1] = t;
                        troquei = 1;
                    }
                } while (++x < compras.length - 1);
            } while (troquei == 1);
    
    
            for (int x = 0; x < compras.length; x++) {
                System.out.print(compras[x] + "\t");
            }
        }

}