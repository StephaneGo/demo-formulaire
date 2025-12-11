package fr.eni.tp.demoformulaire.bo;

import java.util.Objects;

public class Adresse {
    private String rue;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Adresse adresse)) return false;
        return Objects.equals(rue, adresse.rue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rue);
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                '}';
    }
}
