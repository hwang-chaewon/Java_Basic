
public class Book_this_0412 {
	
	String title;
	String author;
	
	void show() {
		System.out.println(title+" "+author);
	}
	public Book_this_0412() { //title, author �� �� ���� ��
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book_this_0412(String title) { //title�� ���� ��
		this(title,"�۰��̻�");
	}
	
	public Book_this_0412(String title, String author) { //title, author �� �� ���� ��
		this.title=title;
		this.author=author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_this_0412 littlePrince=new Book_this_0412("�����", "�������丮");
		Book_this_0412 lovestory=new Book_this_0412("������");
		Book_this_0412 emptybook=new Book_this_0412();
		
		lovestory.show(); //�̰͸� �����ص� ������ ȣ���, ������ �۰��̻��� ��µ�. ������ ȣ����� �� ��µɱ�? �׳� �⺻������ ȣ��ȴٰ� �Ѵ�.

	}

}
