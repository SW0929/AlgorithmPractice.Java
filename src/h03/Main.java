package h03;
//1. 다음 입력 n을 받아 아래와 같은 *을 출력하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		sc.close();
	}

}
