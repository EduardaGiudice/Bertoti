import java.util.ArrayList;


public class Correio implements Subject{
	
	private ArrayList observers;
	private Cliente c;
	
	public Correio(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(double novoAlerta){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novoAlerta);
		}
	}
	
	public double receber(Cliente c){
		
		
		notifyObservers(c.alerta);
		return c.alerta;
		
	}

}