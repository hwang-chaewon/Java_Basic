
//public: ���� ����, �ٸ� ������Ե� �������� ���ϴ� ���ѻ�����
public class Hello {
	
	public static int sum(int n,int m) {
		return n+m;
		//�� ������ �ؼ�: sum�̶�� �Լ��� �ְ�,int m�� int n�̶�� �� ���ڸ� �޾Ƽ� �� ���� int������ � ������� ������ ���̴�.
        //�׷��� java�� main�Լ��� ���� ������ main�Լ� �ȿ��� �� �Լ��� ȣ������ ������ �����ص� sum�Լ��� ���ư��� �ʴ´�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return���� void: ����� �� �Ǵ� �Լ�
		//static: java�� �޸𸮸� ���������� �Ҵ��ϴ� ������ �����µ�,static�� ���̸� �޸𸮸� ������ �Ҵ���
        int i=20;
        int s;
        char a;
        
        s=sum(i,10);
        a='?';
        System.out.println(a); //println: �� ĭ ����ϰ� �� ĭ ���� ��
        System.out.println("Hello");
        System.out.println(s);
	}

}
