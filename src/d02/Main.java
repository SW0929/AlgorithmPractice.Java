package d02;

//�Է��� �� ���� �ִ������� ���Ͽ���
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd = 0; //�ִ�����
		
		
		if(n1 < n2) {
			for(int i = 1; i <= n1; i++) {
				if(n1 % i == 0 && n2 % i == 0) {
					gcd = i;
				}
			}
		}
		else {
			for(int i = 1; i <= n2; i++) {
				if(n1 % i == 0 && n2 % i == 0) {
					gcd = i;
				}
			}
		}
		System.out.println(gcd);
	}

}
