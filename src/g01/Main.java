package g01;
//입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오.2

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i ++) {
			
			for(int j = 0; j < num; j++) {
				//0부터 시작이므로 짝수는 오름차순 홀수는 내림차순
				if(i % 2 == 0)
					System.out.printf("%4d", i*num + j + 1);
				else
					System.out.printf("%4d", i*num + num - j);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
