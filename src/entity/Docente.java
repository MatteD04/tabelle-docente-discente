package entity;

public class Docente {
    private int id;
    private String nome;
    private String cognome;
    private String data_nascita;

    public Docente(){}

    public Docente(int id, String nome, String cognome, String data_nascita) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.data_nascita = data_nascita;
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
    public String getCognome(){
        return cognome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public String getData_nascita(){
        return data_nascita;
    }
    public void setData_nascita(String data_nascita){
        this.data_nascita = data_nascita;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " - Nato il " + data_nascita;
    }
}
