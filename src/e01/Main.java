package e01;
//�Ҽ� �Ǻ� (�����佺�׳׽��� ü �ƴ�)

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
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
		}
		else {
			System.out.println(num+"�� �Ҽ��� �½��ϴ�.");
		}
		
		
		sc.close();
	}
}
