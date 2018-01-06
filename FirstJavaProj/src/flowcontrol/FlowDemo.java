package flowcontrol;

public class FlowDemo {

	public static void main(String[] args) {
		String[] names = {"Soumya", "Pavan", "Visakha", "Ram", "Charan"};
		
		/*for(int i =0;i<names.length;i++){
			System.out.println(names[i]);
		}*/
		
		
		/*for(String xyz: names){
			System.out.println(xyz);
		}*/
		
		for(int i =0;i<10;i++){
			if(i == 5)
				break;
			System.out.println(i);
		}
	}

}
