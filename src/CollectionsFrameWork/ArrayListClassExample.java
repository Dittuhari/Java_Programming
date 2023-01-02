package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;

//how to create an arraylist using ArrayList() constructor
// add new elements to an ArrayList using the add() method
public class ArrayListClassExample {

	public static void main(String[] args) {
		List<String> name= new ArrayList<>();
		//add new element and duplicate 
		name.add("Hari");
		name.add("Gowtham");
		name.add("Prasanth");
		name.add("Praveen");
		name.add("Prasanth");
		
		System.out.println(name);
		
		//add null element
		name.add(null);
		System.out.println(name);
		
	}

}
