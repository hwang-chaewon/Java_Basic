import java.util.Scanner;

//RectApp_0407 class 안도 아니고 아예 밖에다가 클래스를 만들 것. 외부 클래스
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
		System.out.print("width와 height를 입력하세요: ");
		rect.width=scanner.nextInt();
		rect.height=scanner.nextInt();
		System.out.println("사각형의 면적은 "+rect.getArea());
		scanner.close();

	}

}
