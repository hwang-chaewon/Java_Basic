
public class Book_this_0412 {
	
	String title;
	String author;
	
	void show() {
		System.out.println(title+" "+author);
	}
	public Book_this_0412() { //title, author 둘 다 없을 때
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book_this_0412(String title) { //title만 있을 때
		this(title,"작가미상");
	}
	
	public Book_this_0412(String title, String author) { //title, author 둘 다 있을 때
		this.title=title;
		this.author=author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_this_0412 littlePrince=new Book_this_0412("어린왕자", "생텍쥐페리");
		Book_this_0412 lovestory=new Book_this_0412("춘향전");
		Book_this_0412 emptybook=new Book_this_0412();
		
		lovestory.show(); //이것만 실행해도 생성자 호출됨, 춘향전 작가미상이 출력됨. 생성자 호출됨은 왜 출력될까? 그냥 기본적으로 호출된다고 한다.

	}

}
