package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFile {

	public static void main(String[] args) {
		String fileName = "resources\\Facts.txt";
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
