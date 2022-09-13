package pattern;

public class Pessoa {

	private Pagamento pagamento;
	
	public void setPagamento(Pagamento pagamento){
		this.pagamento = pagamento;
	}
	
	public void realizarPagamento() {
		this.pagamento.pagar();
	}
}
