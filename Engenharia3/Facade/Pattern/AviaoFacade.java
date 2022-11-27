package Pattern;


public class AviaoFacade {
	
	private Painel painel;
    private Turbina turbina;
    private Motor motor;

    public AviaoFacade() {
        this.painel = new Painel();
        this.turbina = new Turbina();
        this.motor = new Motor();
    }

    public void run() {
        painel.ligarTela();
        turbina.ligaHelice();
        motor.ligaMotor();
    }
}