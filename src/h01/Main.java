package h01;
//�Էµ� ������ ������ ����϶�

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int a[] = new int[10];
		
		for(int i = 0; i < num.length(); i++) {
			a[num.charAt(i) - '0']++;
		}
		for(int i = 0; i< a.length; i++) {
			System.out.printf("%d: %d\n", i, a[i]);
		}
		sc.close();
	}
}
