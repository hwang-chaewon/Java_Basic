import java.util.Scanner;

public class ArrayLength_0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요: ");
		int intArray[]=new int[5]; //생성과 선언 동시에 함
		double sum=0.0;
		
		for(int i=0;i<intArray.length;i++)
			intArray[i]=scanner.nextInt();
		
		for(int i=0; i<intArray.length;i++)
			sum+=intArray[i];
		
		System.out.print("평균은 "+sum/intArray.length);
		
		scanner.close();

	}

}
