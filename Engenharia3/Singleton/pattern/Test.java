package singleton;

public class Test {
	public static void main(String[] args) {
		
		
		
		User user = new User();
		user.setPassword("1234");
		
		
		Access access = Access.getInstance(user);
		
		System.out.print(access.getUser().getPassword());
		
		
	}
}