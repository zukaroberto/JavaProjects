import java.util.Scanner;

public class Sc_Portugues_ingles_vice_versa_TRANS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao tradutor de dias da semana (Portugues para Inglês) obs.:Não utilizar acentos (´ ` ^ ~ ç)");
        System.out.println("Welcome to the translate of days of the week (English to Portugues) obs.:Do not use (´ ` ^ ~ ç)");
        System.out.println("Dia da Semana? Day of the week?");
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
        case "monday":
            System.out.println("Translation is Segunda");
            break;
        case "tuesday":
            System.out.println("Translation is Terça");
            break;
        case "wednesday":
            System.out.println("Translation is Quarta");
            break;
        case "thursday":
            System.out.println("Translation is Quinta");
            break;
        case "friday":
            System.out.println("Translation is Sexta");
            break;
        case "saturday":
            System.out.println("Translation is Sábado");
            break;
        case "sunday":
            System.out.println("Translation is Domingo");
            break;
        default:
            break;
        }
    }
}
