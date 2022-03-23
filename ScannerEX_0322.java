import java.util.Scanner; //import: 만들어진 것을 추가한다

public class ScannerEX_0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scan을 받을 수 있도록 하기
		System.out.println("이름,도시,나이,체중,독신여부를 분리하여 입력하세요");
		Scanner scanner; //scanner: import를 할 때는 그 불러와진 것에 내가 따로 이름을 부여해야 함
        scanner=new Scanner(System.in); //변수에 값을 부여하듯 또 무언가를 부여해 줘야 함.미리 만들어진 scanner들의 값 중 System.in인 것만을 부여해 준 것
        
        String name; //이름을 받을 변수
        name=scanner.next(); //이렇게 하면 입력받은 첫번째 값이 name으로 들어감
        System.out.println("당신의 이름은 "+name+"입니다");
        
        String city=scanner.next();
        System.out.println("당신이 사는 도시는 "+city+"입니다");
        
        int age=scanner.nextInt(); //int형을 받을 때는 next가 아니라 또 다르게 쓴다
        System.out.println("당신의 나이는 "+age+"입니다");
        
        double weight=scanner.nextDouble();
        System.out.println("당신의 체중은 "+weight+"입니다");
        
        boolean single=scanner.nextBoolean();
        System.out.println("당신의 독신여부는 "+single+"입니다");
        
        scanner.close(); //scanner가 끝나면 닫아 줘야 함
	}

}
