package f01;

//�Էµ� ��(N) ��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�.
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int count = 1;
		for(int i = 0;i < num; i++) {
			for(int k = 0; k < num; k++) {
				System.out.printf("%4d", i*(num) + k + 1);
//				count++;
			}
			System.out.println();
		}
		sc.close();
	}

}
