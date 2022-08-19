package k01;
//100까지 369 게임을 아래와 같이 진행하시오.

public class Main {

	public static void main(String[] args) {
		int i = 0;
		long a = System.nanoTime();
		while(i < 100) {
			i++;
			if(i % 10 == 3 || i % 10 == 6 ||i % 10 == 9) {	
				if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					System.out.print(" 짝짝 ");
				}
				else {
					System.out.print(" 짝 ");
				}					
			}
			else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) 
			{
				if(i % 10 == 3 || i % 10 == 6 ||i % 10 == 9) {
					System.out.print(" 짝짝 ");
				}
				else {
					System.out.print(" 짝 ");
				}	
			}
			else {
				System.out.printf(" %d ", i);
			}
		}
		long b = System.nanoTime();
		//걸린시간 0초
		System.out.println((b-a)/1000000000);
	}
}
