package g03;
//�Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ� ���� �簢���� ����Ͻÿ�.4

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(i == 1)
					System.out.printf("%4d", i+j - 1);
				else
					System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

	}

}
