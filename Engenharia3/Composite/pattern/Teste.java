package pattern;

public class Teste {

	public static void main(String[] args) {

		Grupo grupo = new Grupo();
		Time T1 = new Time();
		Time T2 = new Time();
		Time T3 = new Time();
		
		T1.setNome("Franca");
		T2.setNome("Espanha");
		T3.setNome("Brasil");
		
		grupo.addElementoBasico(T1);
		grupo.addElementoBasico(T2);
		grupo.addElementoBasico(T3);
		
		grupo.exibir();

	}

}