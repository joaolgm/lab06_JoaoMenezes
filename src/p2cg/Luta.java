package p2cg;
/**
 * Classe responsavel por especializar o conceito de Jogo para Luta.
 * @author Joao Menezes
 *
 */
public class Luta extends Jogo {

	public Luta(String nome, int preco, int maiorScore, int qtdVezesJogadas, int qtdVezesZeradas) throws Exception {
		super(nome, preco, maiorScore, qtdVezesJogadas, qtdVezesZeradas);
	}

	@Override
	public int registraJogada(Jogo jogo, int score, boolean zerou) {
		if (score > jogo.getMaiorScore()) {
			jogo.setMaiorScore(score);
			return score/1000;
		}
		return 0;
	}
}
