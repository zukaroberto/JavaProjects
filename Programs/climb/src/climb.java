import java.util.Scanner;

public class climb {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of staircase?");
        int N = sc.nextInt();
        System.out.println("number of ways you can climb?");
        int y = sc.nextInt();
        int[] X = new int[y];
        int Z=0;
            for (int a=0; y > a; a++) {
                System.out.println("number of staircase you can climb?");
                X [a] = sc.nextInt();
            }
            for (int a=0; X.length > a; a++) { 

            /*N=4
            X(0)=1; X(1)=2;
            1, 1, 1, 1  = X(0)+X(0)+X(0)+X(0)
            2, 1, 1     = X(1)+X(0)+X(0)+X(0)
            1, 2, 1
            1, 1, 2
            2, 2
            Z=5

            */
            }
        System.out.println("the number of staircase is " + N);
        System.out.println("the ways you can climb is " + y);
        System.out.println("then there are "+ Z +" unique ways");

    }

}
