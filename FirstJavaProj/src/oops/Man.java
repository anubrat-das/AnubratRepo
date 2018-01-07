package oops;

public class Man extends Human{
	static int i;
	public Tiger travel(){
		System.out.println("Man is travelling");
		return new Tiger();
	}
	
	public void cook(){
		System.out.println("I am cooking");
	}
}
