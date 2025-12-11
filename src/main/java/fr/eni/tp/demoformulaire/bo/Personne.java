package fr.eni.tp.demoformulaire.bo;

import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private Adresse adresse;


    private String motDePasse;

    public Personne() {
    }
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }


    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Personne personne)) return false;
        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }
}
