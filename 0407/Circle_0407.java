
public class Circle_0407 {
	
	int radius; //원의 반지름 필드
	String name; //원의 이름 필드
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle_0407 pizza; //getArea()가 Circle_0407 안에 있는데, Circle_0407을 쓰기 위해서는 (내가 만든 class임에도...)또 이름을 붙여 줘야 한다. pizza라는 이름을 줬다.
		pizza=new Circle_0407(); //pizza에 Circle_0407이라는 class 전체를 집어넣어라. 이제부터 Circle_0407이 곧 pizza이다. pizza안에 변수 radius, getArea함수 등이 다 있는 거다.
		
		pizza.radius=10;
		pizza.name="자바머거";
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle_0407 donut; //Circle_0407은 원형이고, 그 원형을 가져와서 계속 다른 이름으로 몇 개고 쓸 수 있다
		donut = new Circle_0407();
		donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

	}

}
