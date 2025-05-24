package entity;

public class Corso {
    private int id;
    private String nome;
    private String anno_accademico;
    private int id_docente;

    public Corso(){}

    public Corso(int id, String nome, String anno_accademico, int id_docente) {
        this.id = id;
        this.nome = nome;
        this.anno_accademico = anno_accademico;
        this.id_docente = id_docente;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getAnno_accademico(){
        return anno_accademico;
    }
    public void setAnno_accademico(String anno_accademico){
        this.anno_accademico = anno_accademico;
    }
    public int getId_docente(){
        return id_docente;
    }
    public void setId_docente(int id_docente){
        this.id_docente = id_docente;
    }

    @Override
    public String toString() {
        return nome + " " + anno_accademico + " coordinato da " + id_docente;
    }
}
