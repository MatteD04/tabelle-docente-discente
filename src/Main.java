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
    }
}