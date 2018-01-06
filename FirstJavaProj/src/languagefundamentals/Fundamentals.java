package languagefundamentals;

public class Fundamentals {
	
	public static void main(String[] args) {
		
		int j;
		j = 20;
		int c = 43;
		
		int i = 10;
		short s = (short)i;
		
		float f = 4.5f;
		
		char ch = 65;
		
		int chi = ch;
		
		System.out.println(chi);
		System.out.println(ch);
		
		//int r = add(6, 6);
		System.out.println("The summation is "+add(6, 6));
		
		Flat f1 = new Flat("Anubrat", 34000.00, 5);
		System.out.println(f1.owner);
		System.out.println(f1.rent);
		//System.out.println(f1.member);
		
	}
	
	public static int add(int a, int b){
		return a+b;
	}
}
