import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 1;
        int[][][] num = new int[5][4][3];
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 3; z++) {
                    num[x][y][z] = numero++;
                }
            }
        }

        imprimir(num);

    }

    private static void imprimir(int[][][] num) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 3; z++) {
                    System.out.print(num[x][y][z] + "\t");
                }
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }
}
