
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14; //변수 이름이 둘 다 대문자면 상수라는 뜻으로 개발자들 사이에서 이해한다
		double radius=10.2;
		double circleArea=radius*radius*PI; 
		 
		//원의 면적을 화면에 출력하기
		System.out.print("반지름 "+radius+",");
		System.out.println("원의 면적="+circleArea);

	}

}
