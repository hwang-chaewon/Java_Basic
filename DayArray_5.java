import java.util.Scanner;

public class DayArray_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []day= {'��','��','ȭ','��','��','��','��'};
		System.out.print("������ �Է��ϼ���: ");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		if(i>=0) {
			System.out.print(day[i%day.length]);
		}
		else
			System.out.print("�ε����� ������ �Ұ��մϴ�. ");
		scanner.close();
		}

}
