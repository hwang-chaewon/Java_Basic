import java.util.Scanner;

public class Season_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("��(1~12)�� �Է��ϼ���: ");
		int month=scanner.nextInt();
		
		switch(month) {
		case 3: //�̷��� ���̾� ���� 3,4,5 �� �ϳ��� ��� ��� '���Դϴ�'�� ��µ�
		case 4:
		case 5:
			System.out.println("���Դϴ�");
			break; //break�� ������ switch������ Ż����.
		case 6: 
		case 7:
		case 8:
			System.out.println("�����Դϴ�");
			break;
		case 9: 
		case 10:
		case 11:
			System.out.println("�����Դϴ�");
			break;
		case 12: 
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�");
			break;
			
			default:
				System.out.println("�߸��� �Է��Դϴ�"); //switch���� �޸𸮿� �����ؼ�, �̷��� �̻��� ���� �Է����� ���� ����س��� ��
				
		}
		scanner.close();
	}

}
