import java.util.Scanner;

public class SC_salario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Horas que trabalhou ?");
        int horas = sc.nextInt();
        System.out.println("Preço por hora ?");
        double preco = sc.nextDouble();
        System.out.println("Quanto desconta para o seguro ?");
        double desc_seguro = sc.nextDouble();
        System.out.println("Quanto desconta para a segurança social ?");
        double desc_segsoc = sc.nextDouble();
        double liquido=(double)(preco * horas)-desc_seguro-desc_segsoc;
        System.out.println("O teu ordenado liquido é de "+liquido);
    }
}
