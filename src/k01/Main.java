package k01;
//100���� 369 ������ �Ʒ��� ���� �����Ͻÿ�.

public class Main {

	public static void main(String[] args) {
		int i = 0;
		long a = System.nanoTime();
		while(i < 100) {
			i++;
			if(i % 10 == 3 || i % 10 == 6 ||i % 10 == 9) {	
				if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					System.out.print(" ¦¦ ");
				}
				else {
					System.out.print(" ¦ ");
				}					
			}
			else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) 
			{
				if(i % 10 == 3 || i % 10 == 6 ||i % 10 == 9) {
					System.out.print(" ¦¦ ");
				}
				else {
					System.out.print(" ¦ ");
				}	
			}
			else {
				System.out.printf(" %d ", i);
			}
		}
		long b = System.nanoTime();
		//�ɸ��ð� 0��
		System.out.println((b-a)/1000000000);
	}
}
