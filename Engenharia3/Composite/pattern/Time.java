package pattern;

	public class Time implements ElementoBasico{
		
		private String nome;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void exibir() {
			System.out.println(nome);		
		}
		 

	}