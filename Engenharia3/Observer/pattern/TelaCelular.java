
public class TelaCelular implements Observer{
	
	public void update(double alerta){
		
		display(alerta);
		
	}
	
	public void display(double e){
		
		System.out.println("Tela do Celular");
		System.out.println("Sua encomenda chegou do pedido " +e);
	}

}