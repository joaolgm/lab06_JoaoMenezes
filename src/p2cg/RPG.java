package p2cg;

public class RPG extends Jogo {

	public RPG(String nome, int preco, int maiorScore, int qtdVezesJogadas, int qtdVezesZeradas) {
		super(nome, preco, maiorScore, qtdVezesJogadas, qtdVezesZeradas);
	}

	@Override
	public int registraJogada(Jogo jogo, int score, boolean zerou) {
		return 10;
	}
}
