package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<>();
		 //allows add duplicate element
//		 list.add("hari");
//		 list.add("Gopi");
//		 list.add("Agathiyam");
//		 list.add("Gopi");
//		 list.add("hari");
//		 System.out.println(list);
//		 
//		 //allows null element
//		 list.add(null);
//		 list.add(null);
//		 System.out.println(list);
		 
		 //insertion order
		 list.add("element1"); //0
		 list.add("element2"); //1
		 list.add("element3"); //2
		 list.add("element4"); //3
		 list.add("element5"); //4
		 System.out.println(list);
		 
		 //access elements from list
		 System.out.println(list.get(0));
		 System.out.println(list.get(3));
		 
		 
		 
	}

}
