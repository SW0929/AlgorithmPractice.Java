package g02;
//�Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ� ���� �簢���� ����Ͻÿ�.3

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < num; j++) {
				if(j == 0)
					System.out.printf("%4d", i);
				else
					System.out.printf("%4d", i +  num*j);
					
			}
			System.out.println();
		}

		sc.close();
	}

}
