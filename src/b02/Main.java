package b02;
//�ֺ�� ���ϱ�

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[a[i]]++;
		}
		int c = b[0];
		int d = 0;
		
		for(int i = 0; i< b.length; i++) {
			if(c < b[i]) {
				c = b[i];
				d = i;
			}
		}
		System.out.println("�ֺ���� %d, Ƚ���� %d".formatted(d, c));
		sc.close();
	}

}
