package l01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1~100���� ���ڰ� �Էµ� �� �ѹ��̶� �ԷµǾ����� ����Ͻÿ�.


public class Main {

	public static void main(String[] args) throws IOException{
		long a = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int stnum = st.countTokens();
		
		int arry[] = new int[101];
		
		for(int i = 0; i < stnum; i++) {
			arry[Integer.parseInt(st.nextToken())]++;
			
		}
		for(int i = 0; i < arry.length; i++) {
			if(arry[i] > 0) {
				System.out.printf(" %d ", i);
			}
		}
		br.close();
		long b = System.currentTimeMillis();
		
		System.out.println((b-a)/1000);
	}

}
