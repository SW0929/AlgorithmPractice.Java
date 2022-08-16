package o01;
//입력된 두 세 자리 수 중 거꾸로 읽었을 떄 큰 수를 출력하시오.

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String n1 = st.nextToken();
		String n2 = st.nextToken();
		int m1[] = new int[6];
		
		
		for(int i = 0; i < 3; i++) {
			m1[i] = n1.charAt(i)-'0';
			m1[i+3] = n2.charAt(i)-'0';
		}
		for(int i = 0; i < m1.length; i++) {
			System.out.println(m1[i]);
		}
		
		
	}

}
