import java.util.Scanner;

public class Season_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("��(1~12)�� �Է��ϼ���: ");
		int month=scanner.nextInt();
		
		if(month==3 || month==4 || month==5) 
			System.out.println("���Դϴ�");
		else if(month==6 || month==7 || month==8) 
			System.out.println("�����Դϴ�");
		else if(month==9 || month==10 || month==11) 
			System.out.println("�����Դϴ�");
		else if(month==12 || month==1 || month==2) 
			System.out.println("�ܿ��Դϴ�");
		else
			System.out.println("�߸��� �Է��Դϴ�");
		scanner.close();
	}

}

