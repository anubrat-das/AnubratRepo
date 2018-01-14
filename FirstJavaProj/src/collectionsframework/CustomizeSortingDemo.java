package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import languagefundamentals.Flat;

public class CustomizeSortingDemo {

	public static void main(String[] args) {
		
		MaxMemberOrdering ordering = new MaxMemberOrdering();
		/*Set<Flat> flats = new TreeSet<Flat>(ordering);
		
		flats.add(new Flat("Anubrat",40000,5));
		flats.add(new Flat("Rahim",20000,5));
		flats.add(new Flat("Ram",20000,7));
		flats.add(new Flat("Abc",20000,1));
		
		for(Flat fl:flats){
			System.out.println(fl.owner+"\t"+fl.member);
		}*/
		
		List<Flat> flats = new ArrayList<Flat>();
		
		flats.add(new Flat("Anubrat",40000,5));
		flats.add(new Flat("Rahim",20000,5));
		flats.add(new Flat("Ram",20000,7));
		flats.add(new Flat("Abc",20000,1));
		
		Collections.sort(flats, ordering);
		
		for(Flat fl:flats){
			System.out.println(fl.owner+"\t"+fl.member);
		}
		Comparator<Flat> revOrdering = Collections.reverseOrder(ordering);
		
		Collections.sort(flats, revOrdering);
		
		for(Flat fl:flats){
			System.out.println(fl.owner+"\t"+fl.member);
		}
	}

}
