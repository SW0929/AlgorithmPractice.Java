package l02;

//입력된 수가 팬린드롬인지 판별하시오. ex) 12321

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		long first = System.currentTimeMillis();
		int arry[] = new int[num.length()];
		for(int i = 0; i < arry.length; i++) {
			arry[i] = num.charAt(i) - '0';
		}
		int f = arry.length / 2;
		int b = arry.length / 2;
		
		while(true) {
			if(arry[f] == arry[b]) {
				f--;
				b++;
				if(f == -1) {
					System.out.println("true");
					break;
				}
			}
			else {
				System.out.println("false");
				break;
			}
		}
		long second = System.currentTimeMillis();
		System.out.println((second - first) / 1000);
		br.close();
	}

}
