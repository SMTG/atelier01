package sn.supdeco.modele;

public class Etudiant  extends Personne{
 private String matricule;

    public Etudiant(String nom, String prenom, String email, String matricule) {
        super(nom, prenom, email);
        this.matricule = matricule;
    }

    @Override
    public String getRole() {
        return "Etudiant";
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
