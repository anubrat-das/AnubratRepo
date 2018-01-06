package operators;

public class OperatorDemo {

	public static void main(String[] args) {
		
		/*System.out.println(10/3);
		System.out.println(10%3);*/
		
		int i = 7;			//8	7	8	7
		int k = i++;		//7
		int l = i-- + ++i - --i;	//8 + 8 - 7
		
		/*System.out.println(k);
		System.out.println(l);
		System.out.println(i);*/
		
		int a  = 20;
		int b = 30;
		a = b;
		System.out.println(a);
		System.out.println(b);
		
		
		/*String str = null;
		int c = 3;
		
		if(c != 3 & str.length()== 4){
			System.out.println("Entered if");
		}else{
			System.out.println("Entered else");
		}*/
		
		int x =  17 | 22;
		System.out.println(x);
		
		int m = 22;
		int n = 34;
		int o = 24;
		
		String result = (m>n)?"M is greater":"n is greater";
		System.out.println(result);
		
		int z = (m>n)?m:(o>m)?o:m;
		
		System.out.println(z);
		
		
	}

}
