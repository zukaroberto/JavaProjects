

public class Formando {
    private int idFormando;
    private String nome;
    private String genero;
    private int telefones;

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelefones() {
        return telefones;
    }

    public void setTelefones(int telefones) {
        this.telefones = telefones;
    }


    @Override
    public String toString() {
        return "Formando{" +
                "idFormando=" + idFormando +
                ", nome= " + nome +
                ", Genero=" + genero +
                ", telefones=" + telefones +
                '}';
    }
}