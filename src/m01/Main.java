package m01;
//�л����� �������� ������� �Էµȴ�.
//��պ��� ���� �л����� ������ ����Ͻÿ�.

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
		int count = 0; //��ճѴ� �л�
		int sum = 0; // ��� �л��� ���� ��
		double avg = 0.0; //��հ�
		int num = st.countTokens();
		
		
		for(int i = 0; i < num; i++) {
			//ó�� ���� �л� ��
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
		
		//%%�� %ǥ��
		System.out.printf("%.3f%%", (count / (double) as.get(0)) * 100);
	}

}
