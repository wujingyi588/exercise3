package exercise3;

import java.util.Scanner;

public class Practice7_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.next();
		
		s=sort(s);
		System.out.println("The sorted string: "+s);
	}
	public static String sort(String s){
		char[] str = s.toCharArray();
		char temp;
		int k;
		for(int i = 0; i < s.length(); i++){
			k = i;
			for(int j = i+1; j < s.length(); j++)
				if(str[j] < str[k]) k = j;
			temp = str[i];
			str[i] = str[k];
			str[k] = temp;
		}
		String t = new String(str);
		return t;
	}
}
