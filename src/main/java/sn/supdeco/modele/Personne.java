package sn.supdeco.modele;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String email;

    public Personne(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public abstract String getRole();


}
