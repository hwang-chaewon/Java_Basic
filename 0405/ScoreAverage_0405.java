
public class ScoreAverage_0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double score[][]= {{3.3, 3.4},{3.5, 3.6},{3.7,4.0},{4.1,4.2}};
		//{3.3,3.4}는 1학년 1학기와 2학기, {3.5,3.6}은 2학년 1학기와 2학기 식
		
		double sum=0;
		for(int year=0;year<score.length; year++) //score.length라고 하면 4임
			for(int term=0;term<score[year].length;term++)
				sum+=score[year][term];
		int n=score.length; //4
		int m=score[0].length; //2
		System.out.println("4년 동안 전체 학점의 평균은 "+sum/(n*m));

	}

}
