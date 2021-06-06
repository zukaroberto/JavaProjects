import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<cursos> osCursos = new ArrayList<>();
    static ArrayList<Disciplinas> asDisciplinas = new ArrayList<>();


    public static void main(String[] args) {
        int idCurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Formando> lista = new ArrayList<>();
        showMenu menus = new showMenu();
        ArrayList<Cursos> lista2 = new ArrayList<>();
        int escolha = 0;
        int escolhasec = 0;
        do {
            escolha = menus.showMenuPrincipal();
            switch (escolha) {
            case 1:
                do {
                    escolhasec = menus.showMenuSecundário("Formando");
                    switch (escolhasec) {
                    case 1:
                        inserirFormando();
                        break;
                    case 2:
                        modificarFormando();
                        break;
                    case 3:
                        eliminarFormando();
                        break;
                    case 4:
                        for (Formando osFormandos : osFormandos) {
                            System.out.println(osFormandos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 2:
                do {
                    escolhasec = menus.showMenuSecundário("Curso");
                    switch (escolhasec) {
                    case 1:
                        inserirCurso();
                        break;
                    case 2:
                        modificarCurso();
                        break;
                    case 3:
                        System.out.println("Eliminar Curso");
                        break;
                    case 4:
                        for (Cursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            }
        } while (escolha != 9);

    }

    private static void modificarCurso() {
        int idCurso = 1;
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {
               cursos cursos = osCursos.get(id-1);
                String nome = sc.nextLine();
                System.out.println("Nome do Curso:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    cursos.setNome(sc.nextLine());

                System.out.println("Quantas horas:");
                cursos.setHoras(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }
    private static void eliminarFormando(){
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                String nome = sc.nextLine();
                osFormandos.setNome(0);
                
            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void modificarFormando() {
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do formando:");
                formando.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    formando.setNome(sc.nextLine());

                System.out.println("Masculino (True/False):");
                formando.setMasculino(sc.nextBoolean());
                    System.out.println("Telefone:");
                    formando.setTelefones(sc.nextInt());
            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void inserirCurso() {
        int idCurso = 1;
        Scanner sc = new Scanner(System.in);
        cursos cursos = new cursos();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idCurso++);
        System.out.println("Nome do Curso:");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        cursos.setHoras(sc.nextInt());
        osCursos.add(cursos);
    }

    private static void inserirFormando() {
        int idFormando = 1;
        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idFormando++);
        System.out.println("Nome do formando:");
        formando.setNome(sc.nextLine());
        System.out.println("Masculino (True/False):");
        formando.setMasculino(sc.nextBoolean());
            System.out.println("Telefone:");
            formando.setTelefones(sc.nextInt());
        osFormandos.add(formando);
    }
}