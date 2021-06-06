import java.util.Scanner;

public class java_p1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoje é dia da semana? (true or false)");
        boolean dia = sc.nextBoolean();
        if (dia == true) {
            System.out.println("Estamos de ferias? (true or false)");
            boolean ferias = sc.nextBoolean();
            if (ferias == true) {
                System.out.println("Fica na cama ");
            }
            if (ferias == false) {
                System.out.println("vai trabalhar! ");
            }
        }
        if (dia == false) {
            System.out.println("Fica na cama que é fim de semana! ");
        }
    }
}
