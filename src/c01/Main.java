package c01;
//10진수를 2진수로 변환

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int mok = num;
		int dm = 0;
		while(true) {
			
			if (mok >= 2) {
				dm = mok % 2;
				mok = mok / 2;
				al.add(dm);
			}
			else {
				al.add(mok);
				break;
			}
		}
		
		for(int i = al.size()-1; i >= 0; i--) {
			System.out.print(al.get(i));
		}
		sc.close();
	}

}
