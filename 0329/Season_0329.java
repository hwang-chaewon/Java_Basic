import java.util.Scanner;

public class Season_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("월(1~12)을 입력하세요: ");
		int month=scanner.nextInt();
		
		switch(month) {
		case 3: //이렇게 연이어 쓰면 3,4,5 중 하나일 경우 모두 '봄입니다'가 출력됨
		case 4:
		case 5:
			System.out.println("봄입니다");
			break; //break를 만나면 switch문에서 탈출함.
		case 6: 
		case 7:
		case 8:
			System.out.println("여름입니다");
			break;
		case 9: 
		case 10:
		case 11:
			System.out.println("가을입니다");
			break;
		case 12: 
		case 1:
		case 2:
			System.out.println("겨울입니다");
			break;
			
			default:
				System.out.println("잘못된 입력입니다"); //switch문은 메모리에 예민해서, 이렇게 이상한 값을 입력했을 때도 대비해놔야 함
				
		}
		scanner.close();
	}

}
