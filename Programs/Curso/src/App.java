import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<Cursos> osCursos = new ArrayList<>();
    static ArrayList<Inscricoes> asInscricoes = new ArrayList<>();
    static ArrayList<Disciplinas> asDisciplinas = new ArrayList<>();
    static ArrayList<DisciplinasCurso> asDisciplinasCurso = new ArrayList<>();
    static int idFormando = 1;
    static int idCurso = 1;
    static int idDisciplina = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        showMenu menus = new showMenu();

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
                        eliminarCurso();
                        break;
                    case 4:
                        for (Cursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 3:
                do {
                    escolhasec = menus.showMenuInscricao("Inscrições");
                    switch (escolhasec) {
                    case 1:
                        inscricao();
                        break;
                    case 2:
                        eliminarInscricaoFormando();
                        break;
                    case 3:
                        for (Inscricoes asInscricoes : asInscricoes) {
                            System.out.println(asInscricoes.toString());
                        }
                        break;
                    case 4:
                        inscricaoDisciplinas();
                        break;
                    case 5:
                        eliminarInscricaoDisciplinaCurso();
                        break;
                    case 6:
                        for (DisciplinasCurso asDisciplinasCurso : asDisciplinasCurso) {
                            System.out.println(asDisciplinasCurso.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
            case 4:
                do {
                    escolhasec = menus.showMenuDois("Disciplina");
                    switch (escolhasec) {
                    case 1:
                        inserirDisciplina();
                        break;
                    case 2:
                        eliminarDisciplina();
                        break;
                    case 3:
                        for (Disciplinas asDisciplinas : asDisciplinas) {
                            System.out.println(asDisciplinas.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
            }
        } while (escolha != 9);
    }

    private static void eliminarInscricaoDisciplinaCurso() {
        if (asDisciplinasCurso.size() == 0) {
            System.out.println("Não há Inscrições!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (DisciplinasCurso asDisciplinasCurso : asDisciplinasCurso) {
                System.out.println(asDisciplinasCurso.toString());
            }
            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            if (id > 0 && id <= osCursos.size()) {

                asDisciplinasCurso.remove(id - 1);
                System.out.println("Curso com o id " + id + " foi removido");
                for (DisciplinasCurso asDisciplinasCurso : asDisciplinasCurso) {
                    System.out.println(asDisciplinasCurso.toString());
                }

            } else {
                System.out.println("Nao existe um curso com esse id");
            }
        }
    }

    private static void eliminarInscricaoFormando() {
        if (asInscricoes.size() == 0) {
            System.out.println("Não há Inscrições!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Inscricoes asInscricoes : asInscricoes) {
                System.out.println(asInscricoes.toString());
            }
            System.out.println("ID do Formando:");
            int id = sc.nextInt();
            if (id > 0 && id <= osFormandos.size()) {

                asInscricoes.remove(id - 1);
                System.out.println("Formando com o id " + id + " foi removido");
                for (Inscricoes asInscricoes : asInscricoes) {
                    System.out.println(asInscricoes.toString());
                }

            } else {
                System.out.println("Nao existe um formando com esse id");
            }
        }
    }

    private static void eliminarFormando() {
        Formando formando = new Formando();
        if (osFormandos.size() == 0) {
            System.out.println("Não há Formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando osFormandos : osFormandos) {
                System.out.println(osFormandos.toString());
            }
            System.out.println("ID do Formando:");
            int id = sc.nextInt();
            if (id > 0 && id <= osFormandos.size()) {

                osFormandos.remove(id - 1);
                idFormando = 1;
                int y = osFormandos.size();
                for (int x = 1; x < y + 1; x++) {
                    formando = osFormandos.get(x - 1);
                    formando.setIdFormando(idFormando++);
                }
                System.out.println("Formando com o id " + id + " foi removido");
                for (Formando f : osFormandos) {
                    System.out.println(f.toString());
                }

            } else {
                System.out.println("Nao existe um Formandos com esse id");
            }
        }
    }

    private static void eliminarCurso() {
        Cursos cursos = new Cursos();
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Cursos osCursos : osCursos) {
                System.out.println(osCursos.toString());
            }
            System.out.println("ID do curso:");
            int id = sc.nextInt();
            if (id > 0 && id <= osCursos.size()) {

                osCursos.remove(id - 1);
                idCurso = 1;
                int y = osCursos.size();
                for (int x = 1; x < y + 1; x++) {
                    cursos = osCursos.get(x - 1);
                    cursos.setIdCurso(idCurso++);
                }
                System.out.println("Curso com o id " + id + " foi removido");
                for (Cursos c : osCursos) {
                    System.out.println(c.toString());
                }

            } else {
                System.out.println("Nao existe um curso com esse id");
            }
        }
    }

    private static void eliminarDisciplina() {
        Disciplinas disciplinas = new Disciplinas();
        if (osCursos.size() == 0) {
            System.out.println("Não há disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Disciplinas asDisciplinas : asDisciplinas) {
                System.out.println(asDisciplinas.toString());
            }
            System.out.println("ID da disciplina:");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisciplinas.size()) {

                asDisciplinas.remove(id - 1);
                idDisciplina = 1;
                int y = asDisciplinas.size();
                for (int x = 1; x < y + 1; x++) {
                    disciplinas = asDisciplinas.get(x - 1);
                    disciplinas.setIdDisciplina(idDisciplina++);
                }
                System.out.println("Disciplina com o id " + id + " foi removida");
                for (Disciplinas d : asDisciplinas) {
                    System.out.println(d.toString());
                }

            } else {
                System.out.println("Nao existe uma Disciplina com esse id");
            }
        }
    }

    private static void inserirDisciplina() {
        Scanner sc = new Scanner(System.in);
        Disciplinas disciplina = new Disciplinas();
        sc = new Scanner(System.in);
        disciplina.setIdDisciplina(idDisciplina++);
        System.out.println("Nome da disciplina:");
        disciplina.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        disciplina.setHoras(sc.nextInt());
        asDisciplinas.add(disciplina);
    }

    private static void modificarCurso() {
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {
                sc = new Scanner(System.in);
                Cursos cursos = osCursos.get(id - 1);
                String nome = sc.nextLine();
                String nome_mantem = cursos.getNome();
                System.out.println("Nome do Curso:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty()) {
                    cursos.setNome(nome);

                } else {
                    cursos.setNome(nome_mantem);
                }
                System.out.println("Quantas horas:");
                cursos.setHoras(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O curso com o " + id + " não existe");
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
                String nome_mantem = formando.getNome();
                sc = new Scanner(System.in);
                System.out.println("Nome do formando:");
                nome = sc.nextLine();
                if (!nome.isEmpty()) {
                    formando.setNome(nome);

                } else {
                    formando.setNome(nome_mantem);
                }
                sc = new Scanner(System.in);
                String genero_mantem = formando.getGenero();
                System.out.println("Genero (Masculino/Feminino):");
                String genero = sc.nextLine();
                if (!genero.isEmpty()) {
                    formando.setGenero(genero);

                } else {
                    formando.setGenero(genero_mantem);
                }
                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());
            } catch (Exception e) {
                System.out.println("O formando com o " + id + " não existe");
            }
        }
    }

    private static void inserirCurso() {

        Scanner sc = new Scanner(System.in);
        Cursos cursos = new Cursos();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idCurso++);
        System.out.println("Nome do Curso:");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        cursos.setHoras(sc.nextInt());
        osCursos.add(cursos);
    }

    private static void inserirFormando() {

        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idFormando++);
        System.out.println("Nome do formando:");
        formando.setNome(sc.nextLine());
        System.out.println("Genero (Masculino/Feminino):");
        formando.setGenero(sc.nextLine());
        System.out.println("Telefone:");
        formando.setTelefones(sc.nextInt());
        osFormandos.add(formando);
    }

    private static void inscricao() {
        Scanner sc = new Scanner(System.in);
        Inscricoes inscricao = new Inscricoes();
        for (Cursos osCursos : osCursos) {
            System.out.println(osCursos.toString());
        }
        System.out.println("ID do Curso:");
        int id = sc.nextInt();
        inscricao.setIdCurso(id);
        for (Formando osFormandos : osFormandos) {
            System.out.println(osFormandos.toString());
        }

        System.out.println("ID do Formando:");
        int idF = sc.nextInt();
        inscricao.setIdFormando(idF);
        Cursos cursos = osCursos.get(id - 1);
        inscricao.setNomeC(cursos.getNome());
        Formando formando = osFormandos.get(idF - 1);
        inscricao.setNomeF(formando.getNome());
        asInscricoes.add(inscricao);
    }

    private static void inscricaoDisciplinas() {
        Scanner sc = new Scanner(System.in);
        DisciplinasCurso inscricao = new DisciplinasCurso();
        for (Cursos osCursos : osCursos) {
            System.out.println(osCursos.toString());
        }
        System.out.println("ID do Curso:");
        int id = sc.nextInt();
        inscricao.setIdCurso(id);
        for (Disciplinas asDisciplinas : asDisciplinas) {
            System.out.println(asDisciplinas.toString());
        }
        System.out.println("ID da Disciplina:");
        int idD = sc.nextInt();
        inscricao.setIdDisciplina(idD);
        Cursos cursos = osCursos.get(id - 1);
        inscricao.setNomeCurso(cursos.getNome());
        Disciplinas disciplinas = asDisciplinas.get(idD - 1);
        inscricao.setNomeDisciplina(disciplinas.getNome());
        asDisciplinasCurso.add(inscricao);
    }
}