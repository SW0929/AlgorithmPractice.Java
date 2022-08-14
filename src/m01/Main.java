package m01;
//학생수와 점수들이 순서대로 입력된다.
//평균보다 넘은 학생들의 비율을 출력하시오.

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> as = new ArrayList<Integer>();
		int count = 0; //평균넘는 학생
		int sum = 0; // 모든 학생의 점수 합
		double avg = 0.0; //평균값
		int num = st.countTokens();
		
		
		for(int i = 0; i < num; i++) {
			//처음 수는 학생 수
			as.add(Integer.parseInt(st.nextToken()));
			if(i > 0) {
				sum += as.get(i);
			}
			
		}
		avg = (double) sum / as.get(0);
		
		
		for(int i = 1; i < as.get(0); i++) {
			if(as.get(i) > avg) {
				count++;
			}
		}
		
		//%%로 %표시
		System.out.printf("%.3f%%", (count / (double) as.get(0)) * 100);
	}

}
