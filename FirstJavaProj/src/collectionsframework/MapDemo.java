package collectionsframework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
		mp.put("Science", 76);
		mp.put("English", 56);
		mp.put("Social", 98);
		mp.put("Maths", 99);
		mp.put("Hindi", 56);
		mp.put("Science", 80);
		
		Set<String> subjects = mp.keySet();
		Collection<Integer> marks = mp.values();
		Set<Entry<String,Integer>> entries = mp.entrySet();
		
		for(String subject:subjects){
			System.out.println(subject+"\t"+mp.get(subject));
		}
		
		Iterator<String> subItr = subjects.iterator();
		while(subItr.hasNext()){
			String sub = subItr.next();
			System.out.println(sub+"\t"+mp.get(sub));
		}
		
		Iterator<Entry<String,Integer>> entryItr = entries.iterator();
		while(entryItr.hasNext()){
			Entry<String,Integer> entry = entryItr.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}
		
	}

}
