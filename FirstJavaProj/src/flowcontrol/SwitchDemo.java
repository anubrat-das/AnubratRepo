package flowcontrol;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String trafficLight="blue";
		
		switch(trafficLight){
		case "yellow":
			System.out.println("Get ready");
			break;
		case "red":
			System.out.println("Stop");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Not a valid color");
		}
	}

}
