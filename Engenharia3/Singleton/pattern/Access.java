package singleton;

public class Access {
	
	private User user;
	
	private static Access instance;
	
	private Access(User user) {
		this.user = user;
		
	}
	
	public static Access getInstance(User user) {
		if(Access.instance == null) {
			Access.instance = new Access(user);
		}
		
		return Access.instance;
	}

	
	public User getUser() {
		return user;
	}
}