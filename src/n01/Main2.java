package n01;
//N�� �־����� �� N�� ����Ŭ�� ���̸� ���Ͻÿ� (1 <= N <= 100)
//�ٸ� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cycle = n;
		int count = 0;
		
		do {
			n = ((n % 10) * 10) + ((n / 10) + (n % 10)) % 10;
			count++;
		}while(cycle != n);
		
		System.out.println(count);
	}

}
