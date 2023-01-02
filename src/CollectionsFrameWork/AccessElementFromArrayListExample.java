package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;

//how to check if an ArrayList is empty using the isEmpty() method.
//how to find the size of an ArrayList using the size() method
//how to access the element at a particular index in an ArrayList using the get() method
//how to modify the element at a particular index in an ArrayList using the set() method
//remove() method
//removeAll() method
//clear()
public class AccessElementFromArrayListExample {

	public static void main(String[] args) {
		
		List<String> topprogramminglanguage= new ArrayList<>();
		
		//check if an arrayList is empty
		System.out.println("topprogramminglanguage list is empty? ->"+topprogramminglanguage.isEmpty());;
		
		topprogramminglanguage.add("C");
		topprogramminglanguage.add("C++");
		topprogramminglanguage.add("Java");
		topprogramminglanguage.add("Python");
		topprogramminglanguage.add(".Net");
		
		//find the size of an ArrayList
		System.out.println(topprogramminglanguage);
		System.out.println("topprogramminglanguage "+topprogramminglanguage.size()+" programming language in world.");
		
		//Retrieve the element at a given index
		String fistbestProgrammingLang =topprogramminglanguage.get(2);
		System.out.println("fistbestProgrammingLang-> "+fistbestProgrammingLang);
		
		String secondbestProgrammingLang =topprogramminglanguage.get(1);
		System.out.println("secondbestProgrammingLang-> "+secondbestProgrammingLang);
		
		//Modify the element at a give index
		topprogramminglanguage.set(4, "C#");
		System.out.println(topprogramminglanguage);
		
		//remove() method
		topprogramminglanguage.remove(1);
		System.out.println("after removing index 1"+topprogramminglanguage);
		
		topprogramminglanguage.remove("C");
		System.out.println("after removing string C "+topprogramminglanguage);
		
		//removeAll() method
		List<String> ScriptLangiage= new ArrayList<>();
		ScriptLangiage.add("JavaScript");
		ScriptLangiage.add(".Net");
		ScriptLangiage.add("Angluar JS");
		
		System.out.println(ScriptLangiage);
		
		topprogramminglanguage.removeAll(ScriptLangiage);
		System.out.println(topprogramminglanguage);
		
		//clear() method
		topprogramminglanguage.clear();
		System.out.println("clear "+topprogramminglanguage);
		
		
		
	}

}
