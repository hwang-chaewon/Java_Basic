
public class Circle_0412 {

	int radius;
	String name;
	
	public Circle_0412(){//class name과 동일하게 하는 게 생성자
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
		Circle_0412 pizza=new Circle_0412(10,"자바머거");
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle_0412 donut=new Circle_0412();
		donut.name="자바도넛";
		area=donut.getArea(); //area는 예전에 정의한 변수 공간을 그대로 갖다 쓴다. double area로 새로 정의할 필요(x)
		System.out.println(donut.name+"의 면적은 "+area);

	}

}
