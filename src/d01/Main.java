package d01;
//�빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[] = new char[s.length()];
		
		for(int i = 0; i < a.length; i++) {
			//�ƽ�Ű �ڵ� ���� ���� ()�� �ʿ���µ� ������ �� �ʿ��Ѱ�?
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ) {
				a[i] = (char)(s.charAt(i) + 'A'-'a');
			}
			else {
				a[i] = (char)(s.charAt(i) - ('A'-'a'));
			}
		}
		System.out.print(a);
		
		sc.close();
	}

}
