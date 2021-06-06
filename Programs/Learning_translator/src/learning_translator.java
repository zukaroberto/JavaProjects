import java.util.Scanner;

public class learning_translator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao tradutor de dias da semana (Portugues para Inglês) obs.:Não utilizar acentos (´ ` ^ ~ ç)");
        System.out.println("welcome to the weekday translator (English to Portugues) obs.:Do not use (´ ` ^ ~ ç)");
            Continuar continuar = new Continuar ("Continuar? | Continue?");
     //       String[] list1 = new string[14];
       //     String[] list2 = new string[14];
            do {
                System.out.println("Dia da Semana? Day of the week?");
                list1[x] = sc.nextLine().toLowerCase();
                switch (list1[x]) {
                    case list1[0]:
                        System.out.println("Traduz-se "+list2[0]);
                        break;
                    case list1[1]:
                        System.out.println("Traduz-se "+list2[1]);
                        break;
                    case list1[2]:
                        System.out.println("Traduz-se "+list2[2]);
                        break;
                    case list1[3]:
                        System.out.println("Traduz-se "+list2[3]);
                        break;
                    case list1[4]:
                        System.out.println("Traduz-se "+list2[4]);
                        break;
                    case list1[5]:
                        System.out.println("Traduz-se "+list2[5]);
                        break;
                    case list1[6]:
                        System.out.println("Traduz-se "+list2[6]);
                        break;
                    case list1[7]:
                        System.out.println("Traduz-se "+list2[7]);
                        break;
                    case list1[8]:
                        System.out.println("Traduz-se "+list2[8]);
                        break;
                    case list1[9]:
                        System.out.println("Traduz-se "+list2[9]);
                        break;
                    case list1[10]:
                        System.out.println("Traduz-se "+list2[10]);
                        break;
                    case list1[11]:
                        System.out.println("Traduz-se "+list2[11]);
                        break;
                    case list1[12]:
                        System.out.println("Traduz-se "+list2[12]);
                        break;
                    case list1[13]:
                        System.out.println("Traduz-se "+list2[13]);
                        break;
                    default:
                    System.out.println("Desculpe, mas não encontramos na nossa base de dados, como se traduz? Sorry, but we dont have it at our database, how do you translate it?");
                    list2[x] = sc.nextLine().toLowerCase();    
                    break;
                    }
                
            } while (continuar.perguntar());
    }
}
