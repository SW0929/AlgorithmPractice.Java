package e02;
//입력한 수의 팩토리얼을 구하시오

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = num-1; i > 0; i--) {
			num *= i;
		}
		System.out.println(num);
		sc.close();
	}
}
