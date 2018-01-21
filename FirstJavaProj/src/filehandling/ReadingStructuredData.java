package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.Person;

public class ReadingStructuredData {

	public static void main(String[] args) {
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
		
		Iterator<Person> itr = persons.iterator();
		while(itr.hasNext()){
			Person p = itr.next();
			System.out.println(p.getName()+"\t"+p.getNumber()+"\t"+p.getPlace());
		}
	}

}
