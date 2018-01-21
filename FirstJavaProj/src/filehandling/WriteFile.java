package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.Person;

public class WriteFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "resources\\people";
		File f = new File(fileName);
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<Person> persons = new ArrayList<Person>();
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String[] personDetails = line.split("\t");
			Person p = new Person();
			p.setName(personDetails[0]);
			p.setPlace(personDetails[1]);
			p.setNumber(Long.parseLong(personDetails[2]));
			persons.add(p);
		}
		PrintWriter writer = new PrintWriter("resources/peopleout");
		Iterator<Person> itr = persons.iterator();
		while(itr.hasNext()){
			Person p = itr.next();
			writer.println(p.getName()+"\t"+p.getNumber()+"\t"+p.getPlace());
		}
		
		writer.close();
		System.out.println("Writing complete");
	}

}
