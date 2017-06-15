package fr.formation.PersonneVoitureJPA.service.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.PersonneVoitureJPA.metier.Personne;
import fr.formation.PersonneVoitureJPA.service.IGestionPersonne;

public class TestService {
	ClassPathXmlApplicationContext app;
	IGestionPersonne igp;
	Personne p;

	@Before
	public void setUp() {
		app = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		igp = (IGestionPersonne) app.getBean("service");
		p = (Personne) app.getBean("Lapersonne");
	}

	@Test
	public void test() {
		try {
			int nb = igp.findall().size();
			p.setNom("test");
			p.setPrenom("test");
			p.setAge(25);
			igp.ajouterPersonne(p);
			int nb2 = igp.findall().size();
			assertEquals("erreur", nb + 1, nb2, 0);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}

}
