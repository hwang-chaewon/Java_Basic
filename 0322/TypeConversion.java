
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=127;
		int i=100;
		
		System.out.println(b+i); //b가 int형으로 바뀔 것
		System.out.println(10/4); //10,4모두 int형이기 때문에 정수인 2만 나옴
		System.out.println(10.0/4); //4가 4.0으로 자동변환되어 2.5가 나온다
		System.out.println((char)0x12340041); //강제변환.0x12340041는 문자로 하면 대문자 A임.
		System.out.println((byte)(b+i)); //227을 byte형 크기만큼 강제로 자른다. 자르면 -29가 됨
		System.out.println((int)2.9+1.8); //2.9만 int형으로 바꾼다. 결과는 3.8일 것
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);

	}

}
