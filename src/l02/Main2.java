package l02;
//�Էµ� ���� �Ҹ�������� �Ǻ��Ͻÿ�. ex) 12321 �ٸ� Ǯ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		boolean check = true;
		
		for(int i = 0; i < (num.length()-1)/2; i++) {
			if(num.charAt(i)-'0' != num.charAt(num.length()-i-1)-'0') {
				check = false;
			}
		}
		System.out.println(check);
		
	}

}
