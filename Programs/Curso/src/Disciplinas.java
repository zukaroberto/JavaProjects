

public class Disciplinas {
    private int idDisciplina;
    private  String nome;
    private  int horas;
    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return "Disciplinas [Id da disciplina=" + idDisciplina + ", nome=" + nome + ", horas =" + horas + "]";
    }
}
