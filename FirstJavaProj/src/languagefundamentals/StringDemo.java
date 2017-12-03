package languagefundamentals;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Ram";
		String s2 = new String("Ram");
		String s3 = "Ram";
		String s4 = new String("Ram");
		String s5 = s2;
		
		/*System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		
		System.out.println();
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);*/
		
		System.out.println(s1.length());
		
		String s6 = "";
		String s7 = " ";
		String s8 = null;
		
		System.out.println(s6.length());
		System.out.println(s7.length());
		//System.out.println(s8.length());
		
		System.out.println(s1.charAt(0));
		
	}

}
