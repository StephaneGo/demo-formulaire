package fr.eni.tp.demoformulaire.dto;

import java.util.Objects;

public class PersonneDto {
    private String nom;
    private String prenom;
    private String rue;
    private String codePostal;
    private String ville;


    public PersonneDto() {
    }
    public PersonneDto(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
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
        if (!(o instanceof PersonneDto personne)) return false;
        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }
}
