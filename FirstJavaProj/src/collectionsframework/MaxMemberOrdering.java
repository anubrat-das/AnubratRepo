package collectionsframework;

import java.util.Comparator;

import languagefundamentals.Flat;

public class MaxMemberOrdering implements Comparator<Flat>{

	@Override
	public int compare(Flat o1, Flat o2) {
		int diff = o2.member-o1.member;
		if(diff == 0){
			diff = o1.owner.compareTo(o2.owner);
		}
		return diff;
	}

}
