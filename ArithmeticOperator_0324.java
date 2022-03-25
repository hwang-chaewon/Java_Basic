import java.util.Scanner;

public class ArithmeticOperator_0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner; //int x;와 같다. '정수형 x가 만들어졌어요'같이 'Scanner 형 변수 scanner가 만들어졌어요'
		
		scanner=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		//실행 시, 이거 후에 다음 거 실행 안돼서 당황할 수 있는데 그냥 숫자 입력하면 됨..입력하라고 이 코드 한 거잖니
		int time=scanner.nextInt();
		int second=time%60;
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간, ");
		System.out.print(minute+"분, ");
		System.out.print(second+"초입니다. ");
		
		scanner.close();

	}

}
