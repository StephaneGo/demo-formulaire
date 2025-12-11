package fr.eni.tp.demoformulaire.bll;

import fr.eni.tp.demoformulaire.bo.Personne;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoFormulaireServiceImpl implements DemoFormulaireService{
    private List<Personne> personnes;

    public DemoFormulaireServiceImpl() {
        personnes = new ArrayList<>();
    }

    @Override
    public void ajouterPersonne(Personne personne) {
        personnes.add(personne);
    }
}
