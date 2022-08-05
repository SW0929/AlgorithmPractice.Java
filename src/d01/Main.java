package d01;
//대문자는 소문자로, 소문자는 대문자로 변환

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[] = new char[s.length()];
		
		for(int i = 0; i < a.length; i++) {
			//아스키 코드 더할 때는 ()가 필요없는데 뺄셈은 왜 필요한가?
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
