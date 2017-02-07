package p2cg;

import java.util.HashSet;

public class Usuario {

	private String nome, login;
	private double dinheiro;
	private HashSet<Jogo> jogosComprados;
	
	public Usuario(String nome, String login, double dinheiro) {
		this.nome = nome;
		this.login = login;
		this.dinheiro = dinheiro;
	}
		
	public void comprarJogo(Jogo jogo, double preco) {
		double newPreco = preco - jogo.getDesconto();
		if (newPreco < this.dinheiro) {
			jogosComprados.add(jogo);
			dinheiro -= preco;
		}
	}
}
