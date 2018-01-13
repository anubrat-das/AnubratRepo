package collectionsframework;

import java.util.Comparator;

import languagefundamentals.Flat;

public class MaxMemberOrdering implements Comparator<Flat>{

	@Override
	public int compare(Flat o1, Flat o2) {
		return o1.member - o2.member;
	}

}
