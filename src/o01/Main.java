package o01;
//�Էµ� �� �� �ڸ� �� �� �Ųٷ� �о��� �� ū ���� ����Ͻÿ�.


//���� �� Ǯ����
//git config --global core.autocrif true
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
		String m1 = "";
		String m2 = "";
		for(int i = 2; i >=0; i--) {
			m1 += n1.charAt(i);
			m2 += n2.charAt(i);
		}
		if(Integer.parseInt(m1) > Integer.parseInt(m2))
			System.out.println(m1);
		else
			System.out.println(m2);
		
		
		
		
		
	}

}
