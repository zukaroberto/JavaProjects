import java.util.Random;

public class GRSI_Teste_P3 {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int[] lista1 = new int[9];
        int[] lista2 = new int[9];
    
        for (int x = 0; x < lista1.length; x++) {
           lista1[x] = r.nextInt(100)+1;
           System.out.print(lista1[x]+"\t");
        }
        System.out.println(" ");
        for (int x = 0; x < lista2.length; x++) {
            lista2[x] = lista1[x];
     }
     int troquei = 0;
     do {
         int x = 0;
         troquei = 0;

         do {
             if (lista2[x] > lista2[x + 1]) {
                 int t = lista2[x];
                 lista2[x] = lista2[x + 1];
                 lista2[x + 1] = t;
                 troquei = 1;
             }
         } while (++x < lista2.length - 1);
     } while (troquei == 1);
     for (int x = 0; x < lista2.length; x++) {
        System.out.print(lista2[x] + "\t");
    }
    }
}