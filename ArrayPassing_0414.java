public class ArrayPassing_0414 {
	
	static void replacespace(char a[]) {//�̵� main���� ��� �ϱ� ������ static�� ���δ�. static�� ����ó��,����ȭ��� �����ϸ� ���� �� ����
		for(int i=0;i<a.length;i++)
			if(a[i]==' ')
				a[i]='!';
		
	}
	static void printCharArray(char a[]) {//static�� �ٿ��� main���� ȣ�� �����ϹǷ�, ���� static�� ���δ�
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println(); //�� ���� ����: �ٹٲ�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		printCharArray(c);
		replacespace(c);
		printCharArray(c);

	}

}
