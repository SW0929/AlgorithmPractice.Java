package j01;
//3. 다음 입력 n을 받아 아래와 같은 *을 출력하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = 1; j <= num; j++) {
				if(j >= i) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
