package fr.formation.PersonneVoitureJPA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.PersonneVoitureJPA.metier.Personne;
import fr.formation.PersonneVoitureJPA.service.IGestionPersonne;

@Controller
@RequestMapping("/personnes")
public class PersonneController {

	@Autowired
	IGestionPersonne igp;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("personne", new Personne());
		return "personnes";
	}

	@RequestMapping("/addPers")
	public String addPers(Personne p, Model model) throws Exception {
		igp.ajouterPersonne(p);
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("personne", new Personne());
		return "personnes";
	}

	@RequestMapping("/savePers")
	public String savePers(Personne p, Model model) throws Exception {
		if (p.getId() == 0) {
			igp.ajouterPersonne(p);
		} else {
			igp.updatePersonne(p);
		}
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("personne", new Personne());
		return "personnes";
	}

	@RequestMapping("/editPers")
	public String editPers(Personne p, Model model) {
		igp.updatePersonne(p);
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("personne", new Personne());
		return "personnes";
	}

	@RequestMapping("/deletePers")
	public String deletePers(Personne p, Model model) {
		igp.supprimerPersonne(p);
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("personne", new Personne());
		return "personnes";
	}

}
