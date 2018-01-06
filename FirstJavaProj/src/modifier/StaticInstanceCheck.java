package modifier;

public class StaticInstanceCheck {

	public static String name = "Kondapur"; 
	
	int instVar;
	static int statVar;
	
	public void incrementInst(){
		instVar++;
	}
	
	public void incrementStat(){
		statVar++;
	}
	
	
	public static void main(String[] args) {
		
		StaticInstanceCheck sic1  = new StaticInstanceCheck();
		
		System.out.println(sic1.instVar);
		System.out.println(sic1.statVar);
		sic1.incrementInst();
		sic1.incrementStat();
		System.out.println(sic1.instVar);
		System.out.println(sic1.statVar);
		
		StaticInstanceCheck sic2  = new StaticInstanceCheck();
		sic2.incrementInst();
		sic2.incrementStat();
		System.out.println(sic2.instVar);
		System.out.println(sic2.statVar);
		
		StaticInstanceCheck sic3  = new StaticInstanceCheck();
		sic3.incrementInst();
		sic3.incrementStat();
		System.out.println(sic3.instVar);
		System.out.println(sic3.statVar);
		sic1.incrementStat();
		System.out.println(StaticInstanceCheck.statVar);
		
		StaticInstanceCheck.name.length();
		System.out.println();
		
		System.out.println(sic1.instVar);
		System.out.println(statVar);

	}

}
