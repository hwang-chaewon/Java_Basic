
//public: 나만 볼지, 다른 사람에게도 공유할지 정하는 권한생성자
public class Hello {
	
	public static int sum(int n,int m) {
		return n+m;
		//이 문장의 해석: sum이라는 함수가 있고,int m과 int n이라는 두 인자를 받아서 맨 앞의 int형태인 어떤 결과값을 내놓을 것이다.
        //그러나 java는 main함수만 보기 때문에 main함수 안에서 이 함수를 호출하지 않으면 실행해도 sum함수는 돌아가지 않는다
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return값이 void: 출력이 안 되는 함수
		//static: java는 메모리를 자율적으로 할당하는 성질을 가지는데,static을 붙이면 메모리를 무조건 할당함
        int i=20;
        int s;
        char a;
        
        s=sum(i,10);
        a='?';
        System.out.println(a); //println: 한 칸 출력하고 한 칸 띄우는 것
        System.out.println("Hello");
        System.out.println(s);
	}

}
