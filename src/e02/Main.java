package e02;
//�Է��� ���� ���丮���� ���Ͻÿ�

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
