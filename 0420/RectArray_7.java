import java.util.Scanner;

class Rect{
	private int width,height;
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
}

public class RectArray_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect [] rect4=new Rect[4];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<rect4.length;i++) {
			System.out.print("�簢���� width�� �Է��ϼ���: ");
			int width=scanner.nextInt();
			System.out.print("�簢���� height�� �Է��ϼ���: ");
			int height=scanner.nextInt();
			rect4[i]=new Rect(width,height);
			System.out.println((i+1)+"��° �簢���� ���̴� "+rect4[i].getArea());
		}
		scanner.close();
		}

	}
