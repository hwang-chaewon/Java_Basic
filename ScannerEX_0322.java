import java.util.Scanner; //import: ������� ���� �߰��Ѵ�

public class ScannerEX_0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scan�� ���� �� �ֵ��� �ϱ�
		System.out.println("�̸�,����,����,ü��,���ſ��θ� �и��Ͽ� �Է��ϼ���");
		Scanner scanner; //scanner: import�� �� ���� �� �ҷ����� �Ϳ� ���� ���� �̸��� �ο��ؾ� ��
        scanner=new Scanner(System.in); //������ ���� �ο��ϵ� �� ���𰡸� �ο��� ��� ��.�̸� ������� scanner���� �� �� System.in�� �͸��� �ο��� �� ��
        
        String name; //�̸��� ���� ����
        name=scanner.next(); //�̷��� �ϸ� �Է¹��� ù��° ���� name���� ��
        System.out.println("����� �̸��� "+name+"�Դϴ�");
        
        String city=scanner.next();
        System.out.println("����� ��� ���ô� "+city+"�Դϴ�");
        
        int age=scanner.nextInt(); //int���� ���� ���� next�� �ƴ϶� �� �ٸ��� ����
        System.out.println("����� ���̴� "+age+"�Դϴ�");
        
        double weight=scanner.nextDouble();
        System.out.println("����� ü���� "+weight+"�Դϴ�");
        
        boolean single=scanner.nextBoolean();
        System.out.println("����� ���ſ��δ� "+single+"�Դϴ�");
        
        scanner.close(); //scanner�� ������ �ݾ� ��� ��
	}

}
