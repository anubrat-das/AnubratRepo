package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromCommandPrompt {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the file path to read:");
		
		String fileName = sc1.nextLine();;
		File f = new File(fileName);
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		

	}

}
