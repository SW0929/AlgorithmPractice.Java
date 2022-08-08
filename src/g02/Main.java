package g02;
//입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오.3

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < num; j++) {
				if(j == 0)
					System.out.printf("%4d", i);
				else
					System.out.printf("%4d", i +  num*j);
					
			}
			System.out.println();
		}

		sc.close();
	}

}
