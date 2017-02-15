package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import p2cg.Noob;
import p2cg.Plataforma;

public class NoobTest {

	Noob user = new Noob("joao", "joao.menezes", 100, 0);
	Plataforma jogo3 = new Plataforma("mario", 1337, 0, 0, 0);
	
	@Test
	public void testComprarJogo() {
		try {
			user.comprarJogo(jogo3, jogo3.getPreco());
		} catch (Exception e) {
			assertEquals("Nao tem dinheiro suficiente para comprar o jogo.", e.getMessage());
		}
	}
}
