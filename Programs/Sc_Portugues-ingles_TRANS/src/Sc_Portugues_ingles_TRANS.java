import java.util.Scanner;

public class Sc_Portugues_ingles_TRANS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Bem vido ao tradutor de dias da semana (Portugues para Inglês) obs.:Não utilizar acentos (´ ` ^ ~ ç)");

        System.out.println("Dia da Semana?");
        String dia = sc.nextLine();
        switch (dia.toLowerCase()) {
        case "segunda":
            System.out.println("Traduz-se Monday");
            break;
        case "terca":
            System.out.println("Traduz-se Tuesday");
            break;
        case "quarta":
            System.out.println("Traduz-se Wednesday");
            break;
        case "quinta":
            System.out.println("Traduz-se Thursday");
            break;
        case "sexta":
            System.out.println("Traduz-se Friday");
            break;
        case "sabado":
            System.out.println("Traduz-se Saturday");
            break;
        case "domingo":
            System.out.println("Traduz-se Sunday");
            break;
        default:
            break;

        }
    }
}
