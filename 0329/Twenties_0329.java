import java.util.Scanner;

public class Twenties_0329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 //Scanner class만큼의 크기를 가지는 scanner라는 box를 만들어, 값은 미리 만든 Scanner에 있는 값을 넣어라. 다만 class를 다루는 경우 앞에 new라는 연산자를 넣어준다
		 
		 System.out.print("나이를 입력하세요");
		 int age=scanner.nextInt();
		 
		 if((age>=20)&&(age<30)){ //연산을 전체적으로 묶어줘야 한다. (조건1)&&(조건2)는 오류나고 ((조건1)&&(조건2))로 해야 함
			 System.out.print("20대입니다 ");
			 System.out.print("20대라서 행복합니다");
			 
		 }
		 else
			 System.out.println("20대가 아닙니다");
		 
		 scanner.close();
		 

	}

}
