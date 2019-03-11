package rocket;
import java.util.*;
public class Propeller {

//accelerate , brake
	public static final int MIN_POWER = 0; 
	private int max_power, current_power;
	
	public Propeller(int max_power, int current_power) {
		this.max_power = max_power;
		this.current_power = current_power;
	}
	public Propeller() {
	}
	
	public void increaseSpeed() {
		current_power += 10;	
		if(current_power>max_power) {
			current_power=max_power;		
	//*	}else {
	//	current_power=MIN_POWER;
		}		
	}
	public void decreaseSpeed() {  // ************************
		current_power -= 10;
		if(current_power<MIN_POWER) {
			current_power=MIN_POWER;	
		}
	}	
	public void setmaxPower(int max_power) {
		this.max_power = max_power;
	}
	public void setminPower(int MIN_POWER) {				
		this.current_power = MIN_POWER;
	}
	public void addPropellers() {
	}
	public int getCurrentPower() {
		return current_power;
	}
	public int getMin_power() {
		return this.MIN_POWER;
	}
	public String toString() {
		return "" + current_power + "/" + max_power;
	}
}
