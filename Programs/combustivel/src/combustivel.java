import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) throws Exception {
        String[] ilhas = new String[] { "Terceira", "Pico", "Graciosa", "São Jorge", "Faial" };
        double[] vendas = new double[5];

        Scanner sc = new Scanner(System.in);
        for (int x = 0; 5 > x; x++) {
            System.out.println("Insira as vendas para " + ilhas[x]);
            vendas[x] = sc.nextDouble();
        }
        double total = vendas[0] + vendas[1] + vendas[2] + vendas[3] + vendas[4];
        System.out.println("O total de vendas é " + total);
        double preco = vendas[0];

        for (int x = 0; 5 > x; x++) {
            if (preco > vendas[x]) {
                preco = vendas[x];
 
            }
        }
        for (int x = 0; 5 > x; x++) {
            if (preco == vendas[x]) {
                System.out.println("A ilha com menor vendas é " + ilhas[x] + " e o valor é " + vendas[x]);
            }
        }
        preco = vendas[0];
        for (int x = 0; 5 > x; x++) {
            if (preco < vendas[x]) {
                preco = vendas[x];
            }
        }
        for (int x = 0; 5 > x; x++) {
            if (preco == vendas[x]) {
                System.out.println("A ilha com maior vendas é " + ilhas[x] + " e o valor é " + vendas[x]);
            }
        }
        double media = total / 5;
        System.out.println("A media é " + media);
    }
}
