package a01;

public class Student {
	//?̸?
	private String name;
	//?й?
	private int no;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Student(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
}
