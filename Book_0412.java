
public class Book_0412 {
	
	String title;
	String author;
	
	public Book_0412(String t) {
		title=t;
		author="���ڹ̻�";
	}
	
	public Book_0412(String t, String a) {
		title=t;
		author=a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_0412 littlePrince =new Book_0412("�����", "�������丮");
		Book_0412 lovestory =new Book_0412("������");
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(lovestory.title+" "+lovestory.author);
	}

}
