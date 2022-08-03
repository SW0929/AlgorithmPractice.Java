package b01;

public class Main {

	public static void main(String[] args) {
		int fibonacci[] = new int[50];
		
		for(int i = 1; i < fibonacci.length; i++) {
			
			if(i >= 3) {
				fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
			}
			else {
				fibonacci[i] = 1;
			}
			System.out.print(fibonacci[i]+" ");
		}
		
	}

}
