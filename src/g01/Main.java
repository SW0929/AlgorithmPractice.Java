package g01;
//�Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ� ���� �簢���� ����Ͻÿ�.2

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i ++) {
			
			for(int j = 0; j < num; j++) {
				//0���� �����̹Ƿ� ¦���� �������� Ȧ���� ��������
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
