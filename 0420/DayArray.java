import java.util.Scanner;

public class DayArray_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []day= {'일','월','화','수','목','금','토'};
		System.out.print("정수를 입력하세요: ");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		if(i>=0) {
			System.out.print(day[i%day.length]);
		}
		else
			System.out.print("인덱스로 음수는 불가합니다. ");
		scanner.close();
		}

}
