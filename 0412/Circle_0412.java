
public class Circle_0412 {

	int radius;
	String name;
	
	public Circle_0412(){//class name�� �����ϰ� �ϴ� �� ������
		radius=1;
		name=""; 
	}
	
	public Circle_0412(int r, String t) {
		radius=r;
		name=t;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_0412 pizza=new Circle_0412(10,"�ڹٸӰ�");
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle_0412 donut=new Circle_0412();
		donut.name="�ڹٵ���";
		area=donut.getArea(); //area�� ������ ������ ���� ������ �״�� ���� ����. double area�� ���� ������ �ʿ�(x)
		System.out.println(donut.name+"�� ������ "+area);

	}

}
