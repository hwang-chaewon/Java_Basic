import java.util.Scanner;

//RectApp_0407 class �ȵ� �ƴϰ� �ƿ� �ۿ��ٰ� Ŭ������ ���� ��. �ܺ� Ŭ����
class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class RectApp_0407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		Scanner scanner=new Scanner(System.in);
		System.out.print("width�� height�� �Է��ϼ���: ");
		rect.width=scanner.nextInt();
		rect.height=scanner.nextInt();
		System.out.println("�簢���� ������ "+rect.getArea());
		scanner.close();

	}

}
