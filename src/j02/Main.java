package j02;
//���� �Է� n�� m���� ����� ����Ͻÿ�

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
