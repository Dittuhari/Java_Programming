package Array;

public class Example_Array {

	public static void main(String[] args) {
		int a[]= {20,30,49,55};
		System.out.println(a.length); //4
		System.out.println(a);
		//prin one by one value
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);*/
		
		// print all the value attime using for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//print all the value attime using for loop
		for(int i:a) {
			System.out.println(i);
		}
	}

}
