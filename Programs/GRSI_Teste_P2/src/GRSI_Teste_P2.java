import java.util.Random;


public class GRSI_Teste_P2 {
  public static void main(String[] args) throws Exception {
    Random r = new Random();
    int[] lista = new int[9];
    boolean[] verdade = new boolean[9];

    for (int x = 0; x < lista.length; x++) {
       lista[x] = r.nextInt(100)+1;
       System.out.print(lista[x]+"\t");
    }
 }
}