package pattern;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa maria = new Pessoa();
		maria.setPagamento(new Vista()); //Caso Maria seja rica
		maria.realizarPagamento();
		
		System.out.println("-------------------------------------------");
		
		maria.setPagamento(new Prazo());//Caso Maria seja pobre
		maria.realizarPagamento();
	}
}
