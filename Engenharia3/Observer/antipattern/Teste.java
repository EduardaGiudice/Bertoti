package antipattern;

public class Teste {

	public static void main(String[] args) {
		TelaCelular celular = new TelaCelular();
		TelaComputador computador = new TelaComputador();
		
		celular.MostrarConteudo("Conteudo do celular");
		computador.MostrarConteudo("Conteudo do computador");
		
	}

}
