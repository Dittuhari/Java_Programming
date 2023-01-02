package String;

import java.util.Scanner;

public class StringToCharArrayCon {

	public static void main(String[] args) {
		
		String name="Dittu";
		char ch[]=name.toCharArray(); //string value to charArray converted
		for(int i=0;i<name.length();i++) {
			System.out.println(i+"-> "+ch[i]);			
		}
	}

}
