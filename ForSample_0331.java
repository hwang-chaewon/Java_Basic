
public class ForSample_0331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=0;
		
		for(i=1;i<=10;i++) {
			//sum =+i; //이렇게 하면 1+2+3+4+5+6+7+8+9+10=10이 나옴. i가 10에 다다랐을 때 먼저 그 10을 sum에 넣어버리므로 그 10이 출력된 것
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
