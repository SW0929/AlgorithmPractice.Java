package k01;
//100±îÁö 369 °ÔÀÓÀ» ¾Æ·¡¿Í °°ÀÌ ÁøÇàÇÏ½Ã¿À.

public class Main {

	public static void main(String[] args) {
		int i = 0;
		long a = System.nanoTime();
		while(i < 100) {
			i++;
			if(i % 10 == 3 || i % 10 == 6 ||i % 10 == 9) {	
				if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					System.out.print(" Â¦Â¦ ");
				}
				else {
					System.out.print(" Â¦ ");
				}					
			}
			else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) 
			{
				if(i % 10 == 3 || i % 10 == 6 ||i % 10 == 9) {
					System.out.print(" Â¦Â¦ ");
				}
				else {
					System.out.print(" Â¦ ");
				}	
			}
			else {
				System.out.printf(" %d ", i);
			}
		}
		long b = System.nanoTime();
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println((b-a)/1000000000);
	}
}
