package a01;
//�л��̸� ���� �� �˻�
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("īī", 20181101);
		Student st2 = new Student("ȣ�����", 20191234);
		Student st3 = new Student("���ٿ��", 20201188);
		
		ArrayList<Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("�˻��� ���ϸ� y, ���Ḧ ���ϸ� n");
			String yn = sc.nextLine();
			
			if(yn.equals("y")){
				System.out.println("�˻��� �����մϴ�.");
				String name = sc.nextLine();
				//ArrayList�� ������ true�� �ٲ�
				boolean flag = false;
				
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println(s.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("���� �л��̸� �Դϴ�.");
				}
			}
			else if(yn.equals("n")) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			
		}
		sc.close();
	}

}
