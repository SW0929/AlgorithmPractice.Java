package n01;
//N이 주어졌을 때 N의 사이클의 길이를 구하시오 (1 <= N <= 100)

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cycle = num;
		int first = cycle / 10;
		int second = cycle % 10;
		int count = 0;
		
		while(true) {
			cycle = first + second;
			first = second;
			second = cycle % 10;
			count++;
			if(num == first * 10 + second) {
				break;
			}
		}
		
		
		System.out.println(count);
		sc.close();
	}

}
