package antipattern;

	public class Teste {

		public static void main(String[] args) {
			Time time = new Time();
			
			Jogador jogador = new Jogador();
			Comissao comissao = new Comissao();
			
			time.addJogador(jogador);
			time.addComissao(comissao);

		}

	}