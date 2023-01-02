package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		//create the arraylist collection
		Collection<String > collections=new ArrayList<>();
		
		//Predefind methods 
		collections.add("Dittu");
		collections.add("Agathiyan");
		collections.add("Gopi");
		collections.add("Subash");
		collections.add("Manivanan");
		collections.add("Dittu");
		System.out.println(collections);
		
		collections.remove("Dittu");
		System.out.println(collections);
		
		
		System.out.println(collections.contains("Gopi"));
		
		//Lamdada experssion
		collections.forEach((element)->{
			System.out.println(element);
		});
		
		
		collections.clear();
		System.out.println(collections);
		
	}

}
