
public class TelaCaixa implements Observer{
	
	public void update(double alerta){
		
		display(alerta);
		
	}
	
	public void display(double e){
		
		System.out.println("Tela do Computador");
		System.out.println("Sua encomenda chegou do pedido "+e);
	}

}