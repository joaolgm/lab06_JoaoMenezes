package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import p2cg.Plataforma;
import p2cg.Veterano;

public class VeteranoTest {

	Veterano user;
	Plataforma jogo3;

	@Before
	public void start() throws Exception {
		user = new Veterano("joao", "joao.menezes", 100, 1000);
		jogo3 = new Plataforma("mario", 1337, 0, 0, 0);
	}

	@Test
	public void testVeterano() {
		try {
			new Veterano(null, "joao.menezes", 100, 1000);
		} catch (Exception e) {
			assertEquals("Nome nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			new Veterano("", "joao.menezes", 100, 1000);
		} catch (Exception e) {
			assertEquals("Nome nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			new Veterano("joao", null, 100, 1000);
		} catch (Exception e) {
			assertEquals("Login nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			new Veterano("joao", "", 100, 1000);
		} catch (Exception e) {
			assertEquals("Login nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			new Veterano("joao", "joao.menezes", -5, 0);
		} catch (Exception e) {
			assertEquals("Dinheiro nao pode ser menor que zero", e.getMessage());
		}
	}
}
