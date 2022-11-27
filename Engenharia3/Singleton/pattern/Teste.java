package pattern;

public class Teste {
	public static void main(String[] args) {
		
		
		
		Password password = new Password();
		password.setPassword("1234");
		
		
		Access access = Access.getInstance(password);
		
		System.out.print(access.getPassword().getPassword());
		
		
	}
}