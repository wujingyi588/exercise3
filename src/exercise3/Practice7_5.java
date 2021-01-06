package exercise3;

import java.util.Scanner;

public class Practice7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] List=new int[10];
		int flag=1;
		int a=0;
		
		for(int i=0;i<10;i++) {
			int number=input.nextInt();
			flag=1;
			for(int j=0;j<10;j++) {
				if(number==List[j]) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				List[a]=number;
				a++;
			}
		}

		System.out.println("The number of distinct number is "+a);
		System.out.print("The distinct numbers are ");

		for(int i=0;i<a;i++) {
			int x=List[i];
			System.out.print(x+" ");
		}
	}

}
