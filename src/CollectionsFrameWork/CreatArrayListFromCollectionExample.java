package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;

//how to create an arrayList using ArrayList() constructor
//add new elements to an ArrayList using the add() method

//how to add all the elements from an existing collection to the new
//ArratList using the allAll() method
public class CreatArrayListFromCollectionExample {

	public static void main(String[] args) {
		
		//create ArrayList object
		//arrayList constructor default value 10
		List<Integer> firstFivePrimeNumbers =new ArrayList<>();
		firstFivePrimeNumbers.add(12);
		firstFivePrimeNumbers.add(16);
		firstFivePrimeNumbers.add(11);
		firstFivePrimeNumbers.add(19);
		firstFivePrimeNumbers.add(15);
		
		//ArrayList constructor Parameter
		List<Integer> firsttenPrimeNum=new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextPrimeNum= new ArrayList<>();
		nextPrimeNum.add(21);
		nextPrimeNum.add(22);
		nextPrimeNum.add(24);
		nextPrimeNum.add(27);
		nextPrimeNum.add(29);
		
		// addAll() method
		firsttenPrimeNum.addAll(nextPrimeNum);
		System.out.println(firsttenPrimeNum);
		
		
	}

}
