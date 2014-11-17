
public class Dog {
	
	private static Dog instance;
	String name;
	
	private Dog(String name){
		
	}
	
	public static Dog getInstance() {
		if(instance == null) {
			instance = new Dog("chienUnique");
		}		
		return instance;
	}
	
	public void sayName() {
		System.out.println("Dog's name is: " + name);
	}
	

}
