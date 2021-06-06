import java.util.Random;

public class GRSI_Teste_p1 {

    public static void main(String[] args) {
        Random r = new Random();
        int pedro = r.nextInt(6) + 16;
        int manuel = r.nextInt(6) + 16;
        int maria = r.nextInt(6) + 16;
        int velho = 0;
        int novo = 0;
        System.out.println("idade do Pedro é " + pedro);
        System.out.println("idade do Manuel é " + manuel);
        System.out.println("idade da Maria é " + maria);
        if (pedro > manuel) {
            velho = pedro;
        }
        if (pedro < manuel) {
            velho = manuel;
            if (pedro == manuel) {
                velho = manuel;
            }
            if (velho < maria) {
                velho = maria;
            }
            if (maria == velho) {
                System.out.println("Mais velho é a Maria");
            }
            if (manuel == velho) {
                System.out.println("Mais velho é o Manuel");
            }
            if (pedro == velho) {
                System.out.println("Mais velho é o Pedro");
            }
            if (pedro < manuel) {
                novo = pedro;
            }
            if (pedro > manuel) {
                novo = manuel;
            }
            if (novo > maria) {
                novo = maria;
            }
            if (maria == novo) {
                System.out.println("Mais novo é a Maria");
            }
            if (manuel == novo) {
                System.out.println("Mais novo é o Manuel");
            }
            if (pedro == novo) {
                System.out.println("Mais novo é o Pedro");
            }
            if (pedro < manuel && pedro > maria) {
                System.out.println("O do meio é o Pedro");
            }
            if (pedro > manuel && pedro < maria) {
                System.out.println("O do meio é o Pedro");
            }
            if (manuel < pedro && manuel > maria) {
                System.out.println("O do meio é o Manuel");
            }
            if (manuel > pedro && manuel < maria) {
                System.out.println("O do meio é o Manuel");
            }
            if (maria < manuel && maria > pedro) {
                System.out.println("O do meio é a Maria");
            }
            if (maria > manuel && maria < pedro) {
                System.out.println("O do meio é a Maria");
            }
            if (pedro == manuel) {
                System.out.println("Pedro e Manuel são da mesma idade");
            }
            if (pedro == maria) {
                System.out.println("Pedro e Maria são da mesma idade");
            }
            if (manuel == maria) {
                System.out.println("Manuel e Maria são da mesma idade");

            }
            if (pedro == maria && maria == manuel) {
                System.out.println("Todos têm a mesma idade");
            }
        }
    }
}