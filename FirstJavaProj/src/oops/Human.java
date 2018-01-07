package oops;

public class Human {
	static int i;
	public Animal travel(){
		System.out.println("I am travelling");
		return new Tiger();
	}
	
	public void swim(){
		System.out.println("I am swimming");
	}
}
