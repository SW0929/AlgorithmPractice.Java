package j02;
//다음 입력 n의 m승의 결과를 출력하시오

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println((int)Math.pow(n, m));
		sc.close();
	}
}
