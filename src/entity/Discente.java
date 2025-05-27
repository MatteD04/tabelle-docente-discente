package entity;

public class Discente {
    private int id;
    private String nome;
    private String cognome;
    private int matricola;
    private int eta;
    private String citta_residenza;

    public Discente() {}

    public Discente(int id, String nome, String cognome, int matricola, int eta, String citta_residenza) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.eta = eta;
        this.citta_residenza = citta_residenza;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getEta() {
        return eta;
    }

    public String getCitta_residenza() {
        return citta_residenza;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setCitta_residenza(String citta_residenza) {
        this.citta_residenza = citta_residenza;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + matricola + ")" + " proveniente da " + citta_residenza;
    }
}
