
public class ForSample_0331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		
		for(i=1;i<=10;i++) {
			//sum =+i; //�̷��� �ϸ� 1+2+3+4+5+6+7+8+9+10=10�� ����. i�� 10�� �ٴٶ��� �� ���� �� 10�� sum�� �־�����Ƿ� �� 10�� ��µ� ��
			sum+=i;
			System.out.print(i);
			
			if(i<=9) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}

	}

}
