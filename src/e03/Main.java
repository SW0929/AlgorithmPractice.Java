package e03;
//입력된 수의 각 자릿수 합을 구하시오

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int sum = 0;
		
		
		for(int i = 0; i < num.length(); i++) {
			sum = sum + (int)(num.charAt(i)-'0');
		}
		System.out.println(sum);
		sc.close();
	}
}
