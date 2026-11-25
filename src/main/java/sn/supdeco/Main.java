package sn.supdeco;

import sn.supdeco.modele.Etudiant;

public class Main {

    public static void main(String[] args) {

        System.out.println("Gestion des etudiants\n");
        Etudiant e1= new Etudiant( "Gueye", "Samba", "mortalla@gmaoil.com","ET-0012");

        System.out.println(e1.toString());

    }

    }
