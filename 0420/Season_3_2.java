import java.util.Scanner;

public class Season_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("월(1~12)을 입력하세요: ");
		int month=scanner.nextInt();
		
		if(month==3 || month==4 || month==5) 
			System.out.println("봄입니다");
		else if(month==6 || month==7 || month==8) 
			System.out.println("여름입니다");
		else if(month==9 || month==10 || month==11) 
			System.out.println("가을입니다");
		else if(month==12 || month==1 || month==2) 
			System.out.println("겨울입니다");
		else
			System.out.println("잘못된 입력입니다");
		scanner.close();
	}

}

