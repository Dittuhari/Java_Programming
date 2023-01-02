package String;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println("Enter your name or something");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
	
		System.out.println("Old Name "+name);
		System.out.println("New remove duplicate name "+removeDuplicate(name));
	}
	public static String removeDuplicate(String name) {
		String newstr="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(newstr.indexOf(ch)==-1) {
				newstr+=ch;
			}
		}
		return newstr;
	}
}
