package n01;
//N이 주어졌을 때 N의 사이클의 길이를 구하시오 (1 <= N <= 100)
//다른 정답

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
