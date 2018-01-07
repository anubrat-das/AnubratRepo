package oops;

public class Calculator {

	
	public int add(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	public double add(int a, double b){
		return a + b;
	}

	
	public int add(int a, int b, int c){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1,2);
		cal.add(34, 3.5);
	}

}
