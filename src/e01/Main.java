package e01;
//소수 판별 (에라토스테네스의 체 아님)

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count > 2) {
			System.out.println(num+"은 소수가 아닙니다.");
		}
		else {
			System.out.println(num+"은 소수가 맞습니다.");
		}
		
		
		sc.close();
	}
}
