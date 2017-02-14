package p2cg;

public class Noob extends Usuario {
	
	public Noob(String nome, String login, int dinheiro, int x2p) {
		super(nome, login, dinheiro);
		this.x2p = 0;
	}
	
	@Override
	public void comprarJogo(Jogo jogo, int preco) {
		double newPreco = preco - 1/10;
		if (newPreco < this.dinheiro) {
			jogosComprados.add(jogo);
			dinheiro -= preco;
		}
	}
	
	public void x2pPorJogo(Jogo jogo) {
		this.x2p += (10 * jogo.getPreco());
	}
}
