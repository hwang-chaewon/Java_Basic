import java.util.Scanner;

public class Student_4 {
	private String name,number;
	public Student_4(String name, String number) {
		this.name=name;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public String getnum() {
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_4 student1=new Student_4("È«±æµ¿", "20211111");
		Student_4 student2=new Student_4("ÀÌÈ­", "20212222");
		System.out.println(student1.getName()+' '+student1.getnum());
		System.out.println(student2.getName()+' '+student2.getnum());
		

	}

}
