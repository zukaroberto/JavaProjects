

public class Cursos {
    private int idCurso;
    private  String nome;
    private  int horas;
    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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
        return "Cursos [idCurso=" + idCurso + ",nome=" + nome +  ", horas=" + horas + "]";
    }
    }
    