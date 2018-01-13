package collectionsframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		/*Object[] arr = new Object[5];
		arr[0]="Mouse";
		arr[1]="Mobile";
		arr[2]=67;
		Flat fl = new Flat("Abc", 523, 2);
		arr[3] = fl;
		
		
		Flat f11 = (Flat)arr[3];
		
		System.out.println(f11.owner);*/
		
		List<String> al = new ArrayList<String>();
		al.add("Anubrat");
		al.add("Ram");
		al.add("Sourav");
		al.add("Bikram");
		al.add("Ram");
		
		al.remove(2);
		
		/*for(String name:al){
			System.out.println(name);
		}*/
		/*Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		//ListIterator<String> lItr = al.listIterator();
		
		/*while(lItr.hasNext()){
			System.out.println(lItr.next());
		}*/
		/*lItr.next();
		System.out.println(lItr.next());
		
		while(lItr.hasPrevious()){
			System.out.println(lItr.previous());
		}*/

	}

}
