import java.util.Scanner;

public class Twenties_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 //Scanner class��ŭ�� ũ�⸦ ������ scanner��� box�� �����, ���� �̸� ���� Scanner�� �ִ� ���� �־��. �ٸ� class�� �ٷ�� ��� �տ� new��� �����ڸ� �־��ش�
		 
		 System.out.print("���̸� �Է��ϼ���");
		 int age=scanner.nextInt();
		 
		 if((age>=20)&&(age<30)){ //������ ��ü������ ������� �Ѵ�. (����1)&&(����2)�� �������� ((����1)&&(����2))�� �ؾ� ��
			 System.out.print("20���Դϴ� ");
			 System.out.print("20��� �ູ�մϴ�");
			 
		 }
		 else
			 System.out.println("20�밡 �ƴմϴ�");
		 
		 scanner.close();
		 

	}

}
