package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Time {
		
		List<Jogador> jogadores;
		List<Comissao> comissoes;
		
		public Time() {
			jogadores = new ArrayList<>();
			comissoes = new ArrayList<>();
		}
		
		public void addJogador(Jogador jogador) {
			jogadores.add(jogador);
		}
		
		public void addComissao(Comissao comissao) {
			comissoes.add(comissao);
		}
	}