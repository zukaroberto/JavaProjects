

public class DisciplinasCurso {
    private int IdCurso;
    private int idDisciplina;
    private String NomeCurso;
    private String NomeDisciplina;
    public int getIdCurso() {
        return IdCurso;
    }
    public void setIdCurso(int idCurso) {
        IdCurso = idCurso;
    }
    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public String getNomeCurso() {
        return NomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }
    public String getNomeDisciplina() {
        return NomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        NomeDisciplina = nomeDisciplina;
    }
    public DisciplinasCurso() {
        IdCurso = getIdCurso();
        NomeCurso = getNomeCurso();
        NomeDisciplina = getNomeDisciplina();
    }
    @Override
    public String toString() {
        return "DisciplinasCurso [Id do Curso=" + IdCurso + ", Nome do Curso=" + NomeCurso + ", id da Disciplina=" + idDisciplina + ", Nome da Disciplina="
        + NomeDisciplina + "]";
    }
}
