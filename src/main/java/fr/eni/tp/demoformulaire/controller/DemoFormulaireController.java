package fr.eni.tp.demoformulaire.controller;

import fr.eni.tp.demoformulaire.bll.DemoFormulaireService;
import fr.eni.tp.demoformulaire.bo.Adresse;
import fr.eni.tp.demoformulaire.bo.Personne;
import fr.eni.tp.demoformulaire.dto.PersonneDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("personne")
public class DemoFormulaireController {

    private DemoFormulaireService demoFormulaireService;

    public DemoFormulaireController(DemoFormulaireService demoFormulaireService) {
        this.demoFormulaireService = demoFormulaireService;
    }

    @GetMapping("/demo-formulaire")
    public String chargeFormulaire(){
        return "view-demo-formulaire";
    }


    @PostMapping("/demo-formulaire")
    public String chargeFormulairePost( PersonneDto personneDto,
                                       Model model){
        //Personne personne = new Personne(nomUtilisateur,prenomUtilisateur);
        //Personne personne = new Personne(personneDto.getNom(),  personneDto.getPrenom());
        Personne personne = new Personne();
        Adresse adresse = new Adresse();
        personne.setAdresse(adresse);
        BeanUtils.copyProperties(personneDto,personne);
        BeanUtils.copyProperties(personneDto,adresse);

        demoFormulaireService.ajouterPersonne(personne);
        model.addAttribute("personne", personne);

        //return "redirect:/demo-formulaire";
        return "view-demo-formulaire";
    }

    /* Version 1
    @PostMapping("/demo-formulaire")
    public String chargeFormulairePost(@RequestParam String nomUtilisateur,
                                       @RequestParam String prenomUtilisateur,
                                       Model model){
        Personne personne = new Personne(nomUtilisateur,prenomUtilisateur);
        demoFormulaireService.ajouterPersonne(personne);
        model.addAttribute("personne", personne);
        return "view-demo-formulaire";
    }

     */

}
