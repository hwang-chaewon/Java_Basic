
public class ForEachEx_0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]n= {1,2,3,4,5}; //[] �� �迭 ǥ�ô� �տ��ٰ� �ص� �ǰ� �ڿ��ٰ� �ص� ��
		int sum=0;
		
		for(int k:n) {//k�� n[0],n[1],...n[4]
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("���� "+sum);
		
		String f[]= {"���","��","ü��","����","����"};
		for(String s:f)
			System.out.print(s+" ");

	}

}
