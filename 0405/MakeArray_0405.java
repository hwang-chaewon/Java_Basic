
public class MakeArray_0405 {
	
	//main함수 밖에 배열을 반환받는 함수를 하나 만들자.
	//static을 안 붙이면 main에서 makeArray()를 호출하지 못함. 함수의 존재를 인식 못함
	static int[] makeArray() {
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];
		intArray=makeArray();
		
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");

	}

}
