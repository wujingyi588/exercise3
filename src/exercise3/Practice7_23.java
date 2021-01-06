package exercise3;

public class Practice7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] box = new boolean[101];
		for(int i = 1; i <= 100; i++){
			box[i]=true;
		}
		for(int i = 2; i <= 100; i++){
				for(int j = i; j <= 100; j += i){
					box[j] = !box[j];
				}
			}
		System.out.print("The");
		for(int i = 1; i <= 100; i++){
			if(box[i])
				System.out.print(" "+i);
		}
		System.out.print(" cabinet is open.");
	}

}
