package Array;

import java.util.Scanner;

public class SumArray {

	static int sumofarray (int ar[]) {
		int summ=0;
		for(int i=0;i<ar.length;i++) {
			summ=summ+ar[i];
		}
		return summ;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int  x=sc.nextInt();
		int a[]= new int[x];
		System.out.println("enter "+x+" element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			int sum=sumofarray(a);
			System.out.println("sum of array is :"+sum);
		}
		
		
	}

}
