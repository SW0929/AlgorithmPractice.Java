package e01;
//�Ҽ� �Ǻ� (�����佺�׳׽��� ü)

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];
		
		a[0] = a[1] = 1;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			
			if(a[i] == 1) {
				continue;
			}
			for(int j = i * i; j < a.length; j = j + 1) {
				a[j] = 1;
			}
		}
		for(int i = 2; i < a.length; i++) {
			if(a[i] == 0) {
				System.out.print(a[i] + " ");
			}
		}
		
		
		
		sc.close();
	}
}
