//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import entity.Docente;
import entity.Discente;
import entity.Corso;

import java.util.ArrayList;
import java.util.Scanner;
import config.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        //Connection conn = DatabaseConfig.getConnection();

        /*if (conn != null) {
            System.out.println("✅ Connessione al database riuscita!");
        } else {
            System.out.println("❌ Connessione fallita.");
        }*/
        Scanner sc = new Scanner(System.in);

        ArrayList<Docente> docenti = new ArrayList<>();
        ArrayList<Discente> discenti = new ArrayList<>();
        ArrayList<Corso> corsi = new ArrayList<>();

        System.out.println("Quanti docenti vuoi inserire?");
        int nDocenti = sc.nextInt();
        sc.nextLine();

        try (Connection conn = DatabaseConfig.getConnection()) {
            if (conn != null){
                for (int i=0; i< nDocenti; i++){
                    System.out.println("Inserisci ID:");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.println("Inserisci nome:");
                    String nome = sc.nextLine();
                    System.out.println("Inserisci cognome:");
                    String cognome = sc.nextLine();
                    System.out.println("inserisci data di dascita");
                    String data_nascita = sc.nextLine();
                    java.sql.Date data_nascitaSQL = java.sql.Date.valueOf(data_nascita);

                    Docente d = new Docente(id, nome, cognome, data_nascita);
                    docenti.add(d);

                    String sql = "INSERT INTO docente (id, nome, cognome, data_nascita) VALUES (?, ?, ?, ?)";
                    PreparedStatement stmt = conn.prepareStatement(sql);

                    stmt.setInt(1, id);               // ID inserito manualmente
                    stmt.setString(2, nome);          // Nome
                    stmt.setString(3, cognome);       // Cognome
                    stmt.setDate(4, data_nascitaSQL);  // Data di nascita

                    stmt.executeUpdate();
                    stmt.close();

                    System.out.println("✅ Inserito nel database: " + nome + " " + cognome);
                }
            }else {
                System.out.println("❌ Connessione al database fallita.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Errore durante l'inserimento: " + e.getMessage());
        }

        System.out.println("\n--- DOCENTI INSERITI ---");
        for (Docente d : docenti) {
            System.out.println(d);
        }

        System.out.println("Quanti discenti vuoi inserire?");
        int nDiscenti = sc.nextInt();
        sc.nextLine();

        for (int i=0; i< nDiscenti; i++){
            System.out.println("Inserisci ID:");
            int id = sc.nextInt(); sc.nextLine();
            System.out.println("Inserisci nome:");
            String nome = sc.nextLine();
            System.out.println("Inserisci cognome:");
            String cognome = sc.nextLine();
            System.out.println("inserisci matricola");
            String matricola = sc.nextLine();
            System.out.println("Inserisci eta:");
            int eta = sc.nextInt(); sc.nextLine();
            System.out.println("inserisci citta_residenza");
            String citta_residenza = sc.nextLine();


            Discente discente = new Discente(id, nome, cognome, matricola, eta, citta_residenza);
            discenti.add(discente);
        };

        System.out.println("\n--- DISCENTI INSERITI ---");
        for (Discente discente : discenti) {
            System.out.println(discente);
        }

        System.out.println("Quanti corsi vuoi inserire?");
        int nCorsi = sc.nextInt();
        sc.nextLine();

        for (int i=0; i< nCorsi; i++){
            System.out.println("Inserisci ID:");
            int id = sc.nextInt(); sc.nextLine();
            System.out.println("Inserisci nome:");
            String nome = sc.nextLine();
            System.out.println("Inserisci anno_accademico:");
            String anno_accademico = sc.nextLine();
            System.out.println("Inserisci id_docente:");
            int id_docente = sc.nextInt(); sc.nextLine();

            Corso corso = new Corso(id, nome, anno_accademico, id_docente);
            corsi.add(corso);
        };

        System.out.println("\n--- CORSI INSERITI ---");
        for (Corso corso : corsi) {
            System.out.println(corso);
        }


    }
}