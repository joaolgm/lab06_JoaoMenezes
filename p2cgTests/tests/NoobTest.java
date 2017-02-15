package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import p2cg.Noob;
import p2cg.Plataforma;

public class NoobTest {

	Noob user;
	Plataforma jogo3;
	
	@Before
	public void start() throws Exception {
	user = new Noob("joao", "joao.menezes", 100, 0);
	jogo3 = new Plataforma("mario", 1337, 0, 0, 0);
	}
	
	@Test
	public void testComprarJogo() {
		try {
			user.comprarJogo(jogo3, jogo3.getPreco());
		} catch (Exception e) {
			assertEquals("Nao tem dinheiro suficiente para comprar o jogo.", e.getMessage());
		}
	}
}
