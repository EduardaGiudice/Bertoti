package antipattern;

public class Aviao {

	private Turbina turbina;
	private Motor motor;
	private Painel painel;

	public Turbina getTurbina() {
		return turbina;
	}

	public void setTurbina(Turbina turbina) {
		this.turbina = turbina;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Painel getPainel() {
		return painel;
	}

	public void setPainel(Painel painel) {
		this.painel = painel;
	}

}