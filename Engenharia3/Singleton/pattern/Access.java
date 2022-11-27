package pattern;

public class Access {
	
	
	
	private Password password;
	
	private static Access instance;
	
	private Access(Password password) {
		this.password = password;
		
	}
	
	public static Access getInstance(Password password) {
		if(Access.instance == null) {
			Access.instance = new Access(password);
		}
		
		return Access.instance;
	}

	
	public Password getPassword() {
		return password;
	}


	
	

}