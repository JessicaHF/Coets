package rocket;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Propeller> propellers1 = new ArrayList<>();

		propellers1.add(new Propeller(10, 0));
		propellers1.add(new Propeller(30, 0));
		propellers1.add(new Propeller(80, 0));

		List<Propeller> propellers2 = new ArrayList<>();

		propellers2.add(new Propeller(30, 0));
		propellers2.add(new Propeller(40, 0));
		propellers2.add(new Propeller(50, 0));
		propellers2.add(new Propeller(50, 0));
		propellers2.add(new Propeller(30, 0));
		propellers2.add(new Propeller(10, 0));

		Rocket rocket2 = new Rocket("LDSFJA32", propellers2);
		Rocket rocket1 = new Rocket("32WESSDS", propellers1);

		System.out.println(rocket1.getCode() + rocket1.getlistPropellers());
		System.out.println(rocket2.getCode() + rocket2.getlistPropellers());
		
		
	//	for(int decreaseSpeed = 0; decreaseSpeed<=15; decreaseSpeed--){
	//	}
		
		for(int i = 0; i<=15; i++){		
			rocket2.increaseSpeed();
		}
	
		System.out.println(rocket2.getCode() + rocket2.getlistPropellers() + " v Rocket2: " + rocket2.presentSpeed());
		System.out.println(rocket1.getCode() + rocket1.getlistPropellers() + " v Rocket1: " + rocket1.presentSpeed());	
	}
}		
		
	/*	rocket1.decreaseSpeed();
		//for(int decreaseSpeed = 0; decreaseSpeed<=15; decreaseSpeed--){
		rocket2.increaseSpeed();
		rocket2.increaseSpeed();
		rocket2.increaseSpeed();
		rocket2.increaseSpeed();
		rocket2.increaseSpeed();
		rocket2.increaseSpeed();
		rocket2.increaseSpeed();

		 * rocket1.decreaseSpeed(); rocket1.decreaseSpeed(); rocket1.decreaseSpeed();
		 ** rocket2.decreaseSpeed(); rocket2.decreaseSpeed(); rocket2.decreaseSpeed();
		 */
/*
 * List 32WESSDS = new ArrayList<>();
 * 
 * 32WESSDS.add(10); 32WESSDS.add(30); 32WESSDS.add(80);
 * System.out.println("32WESSDS" +32WESSDS ); //ints.add(3); ints.add(5);
 * ints.add(10);
 */