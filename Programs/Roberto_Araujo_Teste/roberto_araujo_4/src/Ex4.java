import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Este programa foi feito com o intuito de saber o interesse dos formandos nos cursos universitários.");
        Scanner sc = new Scanner(System.in);
        int alunos = 0;
        System.out.println("Quantos alunos são?");
        alunos = sc.nextInt();
        String[] curso = new String[alunos];
        String[] local = new String[alunos];
        String[] estacao = new String[alunos];
        int total_letras = 0;
        int total_ciencias = 0;
        int total_acores = 0;
        int total_fora = 0;
        int total_primavera = 0;
        int total_verao = 0;
        int total_outono = 0;
        int total_inverno = 0;
        for (int x = 0; alunos > x; x++) {

            System.out.println("Enter");
            String enter = sc.nextLine();
            System.out.println("Irás frequentar o curso de Letras ou Ciencias?");
            curso[x] = sc.nextLine();
            System.out.println("Irás frequentar a universidade nos Açores ou não?(responder com sim ou nao)");
            local[x] = sc.nextLine();
            System.out.println("Qual a estação do ano que nasceste?(responder com primavera, verao, outono ou inverno)");
            estacao[x] = sc.nextLine();
        }
        for (int x = 0; alunos > x; x++) {
            System.out.println("O aluno " + (x + 1) + " irá frequentar o curso de " + curso[x] + ", " + local[x]
                    + " irá estudar nos Açores e nasceu na estação " + estacao[x]);
        }
        for (int x = 0; alunos > x; x++) {
            switch (curso[x].toLowerCase()) {
            case "letras":
                total_letras = total_letras + 1;
                break;
            case "ciencias":
                total_ciencias = total_ciencias + 1;
                break;
            default:
                break;
            }
            switch (local[x].toLowerCase()) {
            case "sim":
                total_acores = total_acores + 1;
                break;
            case "nao":
                total_fora = total_fora + 1;
                break;
            default:
                break;
            }
            switch (estacao[x].toLowerCase()) {
            case "primavera":
                total_primavera = total_primavera + 1;
                break;
            case "verao":
                total_verao = total_verao + 1;
                break;
                case "outno":
                total_outono = total_outono + 1;
                break;
            case "inverno":
                total_inverno = total_inverno + 1;
                break;
            default:
                break;
            }
        }
        System.out.println("O número total de respostas são "+ (alunos*3));
        System.out.println("Total de formandos que vão para letras é "+ total_letras);
        System.out.println("Total de formandos que vão para ciências é "+ total_ciencias);
        System.out.println("Total de formandos que vão ficar nos Açores é "+ total_acores);
        System.out.println("Total de formandos que não vão ficar nos Açores é "+ total_fora);
        System.out.println("Total de formandos que nasceram na primavera é "+ total_primavera);
        System.out.println("Total de formandos que nasceram na verão é "+ total_verao);
        System.out.println("Total de formandos que nasceram na outono é "+ total_outono);
        System.out.println("Total de formandos que nasceram na inverno é "+ total_inverno);
    }
}
