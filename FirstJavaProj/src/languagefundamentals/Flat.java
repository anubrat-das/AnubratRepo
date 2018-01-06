package languagefundamentals;

public class Flat {
	public String owner;
	double rent;
	private int member;
	
	public Flat(String owner, double rent, int member){
		this.owner = owner;
		this.rent = rent;
		this.member = member;
	}
	
	public void incrementMember(){
		member = member +1;
	}
	
	public void decrementMember(){
		member = member -1;
	}
	
	public void cleanFlat(){
		System.out.println("Flat is cleaned for "+owner);
	}
	
	public static void main(String[] args) {
		Flat f1 = new Flat("Anubrat", 34000.00, 5);
		System.out.println(f1.owner);
		System.out.println(f1.rent);
		System.out.println(f1.member);
		
		Flat f2 = new Flat("Ram", 4500, 3);
		System.out.println(f2.owner);
		System.out.println(f2.rent);
		System.out.println(f2.member);

		Flat f3 = new Flat("Shyam", 45000, 4);
		System.out.println(f3.owner);
		System.out.println(f3.rent);
		System.out.println(f3.member);
		
		
	}
	
}
