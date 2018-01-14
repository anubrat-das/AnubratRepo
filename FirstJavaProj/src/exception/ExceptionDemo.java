package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Calculation start");
		//String str = null;
		//System.out.println(str.length());
		//System.out.println(4/0);
		
		//int[] arr = {4,67,-3};
		//System.out.println(arr[3]);
		m1();
		System.out.println("Calculation complete");
		
	}
	
	public static void m1(){
		m2();
		System.out.println("m1 start");
		System.out.println("m1 end");
	}
	
	public static void m2(){
		System.out.println("m2 start");
		try {
			m3();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch(Exception ie){
			
		}
		System.out.println("m2 end");
	}
	
	public static void m3() throws FileNotFoundException, InterruptedException{
		System.out.println("m3 start");
		System.out.println("m3 end");
		m4();
	}
	
	public static void m4() throws FileNotFoundException{
		System.out.println("m4 start");
		//int[] arr = {4,67,-3};
		//System.out.println(arr[3]);
		//File file = new File("resources/Fact.txt");
		//Scanner sc = new Scanner(file);
		throw new FileNotFoundException();
		
		//System.out.println("m4 end");
	}

}
