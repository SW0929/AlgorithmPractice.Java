package o01;
//�Էµ� �� �� �ڸ� �� �� �Ųٷ� �о��� �� ū ���� ����Ͻÿ�.

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
