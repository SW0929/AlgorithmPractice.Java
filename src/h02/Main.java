package h02;
//������ ���� s���� f�ܱ��� �Է� �޾� �Ʒ��� ���� ����Ͻÿ�

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int f = sc.nextInt();
		for(int j = 1; j <= 9; j++) {
			for(int i = s; i <= f; i++) {
				System.out.printf("%d * %d = %d\t\t", i, j, i*j);
			}
			System.out.println();
		}
		sc.close();
	}

}
