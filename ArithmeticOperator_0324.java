import java.util.Scanner;

public class ArithmeticOperator_0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner; //int x;�� ����. '������ x�� ����������'���� 'Scanner �� ���� scanner�� ����������'
		
		scanner=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		//���� ��, �̰� �Ŀ� ���� �� ���� �ȵż� ��Ȳ�� �� �ִµ� �׳� ���� �Է��ϸ� ��..�Է��϶�� �� �ڵ� �� ���ݴ�
		int time=scanner.nextInt();
		int second=time%60;
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		
		System.out.print(time+"�ʴ� ");
		System.out.print(hour+"�ð�, ");
		System.out.print(minute+"��, ");
		System.out.print(second+"���Դϴ�. ");
		
		scanner.close();

	}

}
