
public class Cat {
	
	String name;
	private static Cat instance = new Cat("chatUnique");
	
	private Cat(String name) {
		
		this.name = name;
		
	}
	
	public static Cat getInstance() {
		return instance;
	}
	
	public void sayName() {
		System.out.println("Cat's name is: " + name);
	}

}
