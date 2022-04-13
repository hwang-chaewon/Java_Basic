public class ArrayPassing_0414 {
	
	static void replacespace(char a[]) {//이따 main에서 써야 하기 때문에 static을 붙인다. static은 전역처리,전역화라고 이해하면 좋을 것 같다
		for(int i=0;i<a.length;i++)
			if(a[i]==' ')
				a[i]='!';
		
	}
	static void printCharArray(char a[]) {//static을 붙여야 main에서 호출 가능하므로, 역시 static을 붙인다
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println(); //이 줄의 역할: 줄바꿈
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		printCharArray(c);
		replacespace(c);
		printCharArray(c);

	}

}
