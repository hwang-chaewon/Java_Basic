
public class Circle_0407 {
	
	int radius; //���� ������ �ʵ�
	String name; //���� �̸� �ʵ�
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle_0407 pizza; //getArea()�� Circle_0407 �ȿ� �ִµ�, Circle_0407�� ���� ���ؼ��� (���� ���� class�ӿ���...)�� �̸��� �ٿ� ��� �Ѵ�. pizza��� �̸��� ���.
		pizza=new Circle_0407(); //pizza�� Circle_0407�̶�� class ��ü�� ����־��. �������� Circle_0407�� �� pizza�̴�. pizza�ȿ� ���� radius, getArea�Լ� ���� �� �ִ� �Ŵ�.
		
		pizza.radius=10;
		pizza.name="�ڹٸӰ�";
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle_0407 donut; //Circle_0407�� �����̰�, �� ������ �����ͼ� ��� �ٸ� �̸����� �� ���� �� �� �ִ�
		donut = new Circle_0407();
		donut.radius=2;
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);

	}

}
