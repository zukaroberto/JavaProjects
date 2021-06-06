import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Este programa foi feito com o intuito de saber vendas nos primeiros 4 meses nos três grupos dos Açores.");
        Scanner sc = new Scanner(System.in);
        double[] ocidental = new double[4];
        double[] oriental = new double[4];
        double[] central = new double[4];
        double total_ocidental = 0;
        double total_central = 0;
        double total_oriental = 0;
        for (int x = 0; 4 > x; x++) {
            System.out.println("No grupo Ocidental qual o preço total das vendas no " + (x + 1) + " º mes?");
            ocidental[x] = sc.nextDouble();
        }
        for (int x = 0; 4 > x; x++) {
            System.out.println("No grupo Central qual o preço total das vendas no " + (x + 1) + " º mes?");
            central[x] = sc.nextDouble();
        }
        for (int x = 0; 4 > x; x++) {
            System.out.println("No grupo Oriental qual o preço total das vendas no " + (x + 1) + " º mes?");
            oriental[x] = sc.nextDouble();
        }
        System.out.println(" ");
        System.out.println("As vendas no grupo Ocidental foram:");
        for (int x = 0; 4 > x; x++) {
            System.out.print(ocidental[x] + " €; ");
        }
        System.out.println(" ");
        System.out.println("As vendas no grupo Central foram:");
        for (int x = 0; 4 > x; x++) {
            System.out.print(central[x] + " €; ");
        }
        System.out.println(" ");
        System.out.println("As vendas no grupo Oriental foram:");
        for (int x = 0; 4 > x; x++) {
            System.out.print(oriental[x] + " €; ");
        }
        System.out.println(" ");
        for (int x = 0; 4 > x; x++) {

            total_oriental = total_oriental + oriental[x];
            total_central = total_central + central[x];
            total_ocidental = total_ocidental + ocidental[x];
        }

        System.out.println("Total geral é 12");
        System.out.println("Total geral do grupo Ocidental é" + total_ocidental);
        System.out.println("Total geral do grupo Central é" + total_central);
        System.out.println("Total geral do grupo Oriental é" + total_oriental);
        if (total_central > total_ocidental && total_central > total_oriental)
            System.out.println("Melhor grupo é o Central");
        if (total_ocidental > total_central && total_central > total_oriental)
            System.out.println("Melhor grupo é o Ocidental");
        if (total_oriental > total_ocidental && total_central < total_oriental)
            System.out.println("Melhor grupo é o Oriental");
        int prim_mes=ocidental [0]+ central [0] + oriental [0];
        int seg_mes=ocidental [1]+ central [1] + oriental [1];
        int terc_mes=ocidental [2]+ central [2] + oriental [2];
        int quart_mes=ocidental [3]+ central [3] + oriental [3];
        if (prim_mes>secun_mes  && prim_mes>terc_mes && prim_mes > quart_mes);
        System.out.println("O melhor mês é o primeiro");
        if (prim_mes<seg_mes  && seg_mes>terc_mes && seg_mes > quart_mes);
        System.out.println("O melhor mês é o segundo");
        if (terc_mes>seg_mes  && prim_mes<terc_mes && terc_mes > quart_mes);
        System.out.println("O melhor mês é o terceiro");
        if (quart_mes>seg_mes  && quart_mes>terc_mes && prim_mes < quart_mes);
        System.out.println("O melhor mês é o quarto");
    }
}
