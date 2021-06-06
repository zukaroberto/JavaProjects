

public class Inscricoes {
private int IdCurso;
private int IdFormando;
private String NomeC;
private String NomeF;
public int getIdCurso() {
    return IdCurso;
}
public void setIdCurso(int idCurso) {
    IdCurso = idCurso;
}
public int getIdFormando() {
    return IdFormando;
}
public void setIdFormando(int idFormando) {
    IdFormando = idFormando;
}
public String getNomeC() {
    return NomeC;
}
public void setNomeC(String nomeC) {
    NomeC = nomeC;
}
public String getNomeF() {
    return NomeF;
}
public void setNomeF(String nomeF) {
    NomeF = nomeF;
}

@Override
public String toString() {
    return "Inscricoes [IdCurso=" + IdCurso + ", NomeCurso=" + NomeC  + ", IdFormando=" + IdFormando + ", NomeFormando=" + NomeF
            + "]";
}

}
