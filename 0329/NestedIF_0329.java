import java.util.Scanner;

public class NestedIF_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(0~100��): ");
		int score=scanner.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int year=scanner.nextInt();
		
		if(score>=60) {
			if(year !=4)
				System.out.println("�հ�");
			else if(score>=70)
				System.out.println("�հ�");
			else
				System.out.println("���հ�");
		}
		else
			System.out.println("���հ�");
		
		scanner.close();

	}

}
