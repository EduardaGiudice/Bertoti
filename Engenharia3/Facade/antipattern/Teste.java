package antipattern;

public class Teste {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		Turbina turbina = new Turbina();
		Motor motor = new Motor();
		Painel painel = new Painel();
		
		aviao.setTurbina(turbina);
		aviao.setMotor(motor);
		aviao.setPainel(painel);
		
		aviao.getTurbina().ligarTurbina();
		aviao.getMotor().ligarMotor();
		aviao.getPainel().ligarPainel();

	}
}
