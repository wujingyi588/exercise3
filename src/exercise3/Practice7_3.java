package exercise3;

import java.util.Scanner;

public class Practice7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] List =new int[101];
		for(int i=0;;i++){
            i = input.nextInt();
            if(i == 0)
                break;
             List[i]++;
         }  

		for(int j=1;j<=100;j++) {
			if(List[j]==1) 
				System.out.println(j+" occurs "+List[j]+" time");
			else if(List[j]>1) 
				System.out.println(j+" occurs "+List[j]+" times");			
		}
	}

}
