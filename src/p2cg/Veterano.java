package p2cg;

public class Veterano extends Usuario {
	
	public Veterano(String nome, String login, int dinheiro, int x2p) {
		super(nome, login, dinheiro);
		this.x2p = 1000;
	}
	
	@Override
	public void comprarJogo(Jogo jogo, int preco) {
		double newPreco = preco - 1/5;
		if (newPreco < this.dinheiro) {
			jogosComprados.add(jogo);
			dinheiro -= preco;
		}
	}

	public void x2pPorJogo(Jogo jogo) {
		x2p += (15 * jogo.getPreco());
	}
}
