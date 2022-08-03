package a01;
//학생이름 저장 및 검색
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("카카", 20181101);
		Student st2 = new Student("호나우두", 20191234);
		Student st3 = new Student("히바우두", 20201188);
		
		ArrayList<Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("검색을 원하면 y, 종료를 원하면 n");
			String yn = sc.nextLine();
			
			if(yn.equals("y")){
				System.out.println("검색을 시작합니다.");
				String name = sc.nextLine();
				//ArrayList에 없으면 true로 바뀜
				boolean flag = false;
				
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println(s.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("없는 학생이름 입니다.");
				}
			}
			else if(yn.equals("n")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			
		}
		sc.close();
	}

}
