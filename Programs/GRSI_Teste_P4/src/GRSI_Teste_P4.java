import java.util.Random;

public class GRSI_Teste_P4 {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int[] lista1 = new int[9];
        int[] lista2 = new int[9];
        int x = 0;
        int y = 0;
        int maior1 = 0;
        int menor1 = 11;
        int maior2 = 0;
        int menor2 = 11;
        int total1 = 0;
        int total2 = 0;

        for (; x < lista1.length; x++) {
            lista1[x] = r.nextInt(9) + 1;
            System.out.print(lista1[x] + "\t");
            if (lista1[x] > maior1) {
                maior1 = lista1[x];
            }
            if (lista1[x] < menor1) {
                menor1 = lista1[x];
            }

            total1 = total1 + lista1[x];
        }
        System.out.println(" ");
        System.out.println("Maior na lista 1 é " + maior1);
        System.out.println("Menor na lista 1 é " + menor1);
        System.out.println("Total da lista 1 é " + total1);
        System.out.println(" ");
        for (; y < lista2.length; y++) {
            lista2[y] = r.nextInt(9) + 1;
            System.out.print(lista2[y] + "\t");
            if (lista2[y] > maior2) {
                maior2 = lista2[y];
            }
            if (lista2[y] < menor2) {
                menor2 = lista2[y];
            }
            total2 = total2 + lista2[y];
        }
        System.out.println(" ");
        System.out.println("Maior na lista 2 é " + maior2);
        System.out.println("Menor na lista 2 é " + menor2);
        System.out.println("Total da lista 2 é " + total2);
        int q = 1;
        x = 0;
        int a = 0;
        int temp = 0;
        int count = 0, tempCount;
        for (; x < lista1.length; x++) {
            temp = lista1[x];
            tempCount = 0;
            for (q = 1; q < lista1.length; q++)
                if (temp == lista1[q]) {
                    tempCount++;
                }
            if (tempCount > count) {
                a = temp;
                count = tempCount;
            }  

        }
        int w = 1;
        y = 0;
        int e = 0;
        int temp1 = 0;
        int count1 = 0, tempCount1;
        for (; y < lista2.length; y++) {
            temp1 = lista2[y];
            tempCount1 = 0;
            for (w = 1; w < lista1.length; w++)
                if (temp1 == lista2[w]) {
                    tempCount1++;
                }
            if (tempCount1 > count1) {
                e = temp1;
                count1 = tempCount1;
                }       
            }
System.out.println("Aparece mais vezes o "+ a + " na lista 1 e repetiu-se " + count + " vezes");
System.out.println("Aparece mais vezes o "+ e + " na lista 2 e repetiu-se " + count1 + " vezes");
    }
}
