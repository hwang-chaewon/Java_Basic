
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=127;
		int i=100;
		
		System.out.println(b+i); //b�� int������ �ٲ� ��
		System.out.println(10/4); //10,4��� int���̱� ������ ������ 2�� ����
		System.out.println(10.0/4); //4�� 4.0���� �ڵ���ȯ�Ǿ� 2.5�� ���´�
		System.out.println((char)0x12340041); //������ȯ.0x12340041�� ���ڷ� �ϸ� �빮�� A��.
		System.out.println((byte)(b+i)); //227�� byte�� ũ�⸸ŭ ������ �ڸ���. �ڸ��� -29�� ��
		System.out.println((int)2.9+1.8); //2.9�� int������ �ٲ۴�. ����� 3.8�� ��
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);

	}

}
