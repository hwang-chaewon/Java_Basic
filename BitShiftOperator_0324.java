
public class BitShiftOperator_0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a=(short)0x55ff;
		short b=(short)0x00ff;
		
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a&b));
		System.out.printf("%04x\n", (short)(a|b));
		System.out.printf("%04x\n", (short)(a^b));
		System.out.printf("%04x\n", (short)(~a));
		
		byte c=20;
		byte d= -8;
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.println(d>>>2);

	}

}
