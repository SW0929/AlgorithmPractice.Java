package f01;

//입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
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
