package String;

import java.util.Scanner;

public class CaptialLetterandSmallLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name(Captial or small)");
		String name=sc.nextLine();
		
		int cl=0,sl=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i); //index value character converted
			if(ch>='A'&& ch<='Z')
				cl++;
			else if(ch>='a' && ch<='z')
				sl++;
		}
		System.out.println("Captial letter "+cl);
		System.out.println("Small Letter "+sl);
	}

}
