package exercise3;

import java.util.Scanner;

public class Practice7_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++)
            list2[i] = input.nextInt();
        
        int[] list3 = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int i = 0; i < list3.length; i++)
            System.out.print(list3[i] + " ");
	}
	public static int[] merge(int[] list1, int[] list2){
		int[] list3 = new int[list1.length + list2.length];
		int i = 0, j = 0, n = 0;
		while(i != list1.length || j != list2.length){
            if(i == list1.length) {
                list3[n] = list2[j];
                j++;
                n++;
                continue;
            }
            if(j == list2.length) {
            	list3[n] = list1[i];
                i++;
                n++;
                continue;
            }
            if(list1[i] <= list2[j]){
            	list3[n] = list1[i];
                i++;
            }else{
            	list3[n] = list2[j];
                j++;
            }
            n++;
        }
		return list3;
	}
}
