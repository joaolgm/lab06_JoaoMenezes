package p2cg;

public class Plataforma extends Jogo {

	public Plataforma(String nome, int preco, int maiorScore, int qtdVezesJogadas, int qtdVezesZeradas) {
		super(nome, preco, maiorScore, qtdVezesJogadas, qtdVezesZeradas);
	}

	@Override
	public int registraJogada(Jogo jogo, int score, boolean zerou) {
		if (zerou == true) {
			return 20;
		}
		return 0;
	}
}