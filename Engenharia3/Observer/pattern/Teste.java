
public class Teste {

	public static void main(String[] args) {
		
		Correio cor = new Correio();
		TelaComputador tela = new TelaComputador();
		TelaCelular cel = new TelaCelular();
		cor.registerObserver(tela);
		cor.registerObserver(cel);
		
		Cliente Amanda = new Cliente(1476.21, "Amanda Souza", "Rua Alvorada 132");
		
		amanda.alerta = cor.receber(Amanda);
	}
}