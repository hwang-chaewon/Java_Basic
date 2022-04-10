
public class ForEachEx_0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]n= {1,2,3,4,5}; //[] 이 배열 표시는 앞에다가 해도 되고 뒤에다가 해도 됨
		int sum=0;
		
		for(int k:n) {//k는 n[0],n[1],...n[4]
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은 "+sum);
		
		String f[]= {"사과","배","체리","딸기","포도"};
		for(String s:f)
			System.out.print(s+" ");

	}

}
