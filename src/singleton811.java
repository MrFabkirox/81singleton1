import java.util.ArrayList;
import java.util.List;


public class singleton811 {

	static List<Cat> chats = new ArrayList<>();
	static List<Dog> chiens = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Cat tom = Cat.getInstance();		
		Cat garfield = Cat.getInstance();
		
		chats.add(tom);
		chats.add(garfield);
		
		for (Cat cat: chats) {
			System.out.println(cat.name);
		}
		
		Dog rantanplan = Dog.getInstance();		
		Dog milou = Dog.getInstance();
		
		chiens.add(rantanplan);
		chiens.add(milou);
				
		for (Dog dog: chiens) {
			System.out.println(dog.name);
		}
		

	}
}
