
public class ScoreAverage_0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double score[][]= {{3.3, 3.4},{3.5, 3.6},{3.7,4.0},{4.1,4.2}};
		//{3.3,3.4}�� 1�г� 1�б�� 2�б�, {3.5,3.6}�� 2�г� 1�б�� 2�б� ��
		
		double sum=0;
		for(int year=0;year<score.length; year++) //score.length��� �ϸ� 4��
			for(int term=0;term<score[year].length;term++)
				sum+=score[year][term];
		int n=score.length; //4
		int m=score[0].length; //2
		System.out.println("4�� ���� ��ü ������ ����� "+sum/(n*m));

	}

}
