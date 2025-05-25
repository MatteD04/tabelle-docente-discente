//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import entity.Docente;
import entity.Discente;
import entity.Corso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Docente> docenti = new ArrayList<>();
        ArrayList<Discente> discenti = new ArrayList<>();
        ArrayList<Corso> corsi = new ArrayList<>();

        System.out.println("Quanti docenti vuoi inserire?");
        int nDocenti = sc.nextInt();
        sc.nextLine();

        for (int i=0; i< nDocenti; i++){
            System.out.println("Inserisci ID:");
            int id = sc.nextInt(); sc.nextLine();
            System.out.println("Inserisci nome:");
            String nome = sc.nextLine();
            System.out.println("Inserisci cognome:");
            String cognome = sc.nextLine();
            System.out.println("inserisci data di dascita");
            String data_nascita = sc.nextLine();

            Docente d = new Docente(id, nome, cognome, data_nascita);
            docenti.add(d);
        };

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