package oops;

import modifier.AbsClass;

public class RoughWork {

	public static void main(String[] args) {
		/*Man m = new Man(); // Here m is reference of Man class and holding object of Man class
		Woman w = new Woman();
		Human h = new Human();
		m.travel();
		m.swim();
		m.cook();
		w.travel();
		w.swim();
		w.drive();
		h.travel();
		h.swim();*/
		
		/*Man m = new Man();
		Woman w = new Woman();
		Human h = new Human();
		//Man mh = new Human();
		Human hm = new Man();	//Parent class reference can hold child class object but vice versa is not true
		m.travel();
		h.travel();
		hm.travel();
		
		callTravel(m);
		callTravel(w);
		callTravel(h);
		System.out.println(m.i);
		System.out.println(h.i);*/
		
		/*AbsClass ac = new AbsImpl();
		ac.m2("Raj");
		ac.m1();
		
		AbsImpl ai = new AbsImpl();
		ai.m2("Abc");
		ai.m1();
		
		Human h = new Man();
		Animal a = h.travel();*/
		
		Tiger aa  = new Tiger();
		aa.run();
		aa.run("Hyderabad");
		
		System.out.println(aa);
		System.out.println(aa.toString());
		
	}
	
	/*public static void callTravel(Human mm){
		System.out.println(mm.getClass().getName());
		mm.travel();
		mm.i++;
	}*/
	

}
