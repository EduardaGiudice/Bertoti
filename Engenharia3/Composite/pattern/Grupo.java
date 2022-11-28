package pattern;


	import java.util.ArrayList;
	import java.util.List;

	public class Grupo implements ElementoBasico{
		
		 private List<ElementoBasico> timesList;
		 private String nome;
		 
		 public Grupo() {
			 timesList = new ArrayList<>();
		 }

		public List<ElementoBasico> getElementos() {
			return timesList;
		}

		public void setElementos(List<ElementoBasico> timesList) {
			this.timesList = timesList;
		}

		public String getDescricao() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void exibir() {
			for (ElementoBasico item : timesList) {
				item.exibir();
			}
		}
		
		public void addElementoBasico(ElementoBasico item) {
			timesList.add(item);
		}
		
		public void removeElementoBasico(ElementoBasico item) {
			timesList.remove(item);
		}
	}
