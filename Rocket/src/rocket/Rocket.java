package rocket;
import java.util.List;

public class Rocket {

	private String code;
	private List<Propeller> listPropellers;
	public double speed = 0;

	public Rocket(String code,List<Propeller> propellers) {
		this.code = code;
		this.listPropellers = propellers;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setPropellers(List<Propeller> propellers) {
		this.listPropellers = propellers;
	}
	public double presentSpeed() {
		float sumPropellers = 0;/// fer for each per sumar les potencies dels propellers
		for (Propeller propeller : listPropellers) {
			sumPropellers = propeller.getCurrentPower();
		}
			speed = speed + 100 * Math.sqrt(sumPropellers);
			return speed;
	}
	public String getCode() {
		return this.code;
	}
	public List<Propeller> getlistPropellers() {
		return this.listPropellers;
	}
	public void increaseSpeed() {

		for (Propeller p : listPropellers) {
			p.increaseSpeed();
		}
	}
	public void decreaseSpeed(int i) {
		for (Propeller p : listPropellers) {
			p.decreaseSpeed();
		}
	}
}
//for(Propeller p : listPropellers){
//p.accelerate()}
//	for(Integer listPropeller:Listpropeller);
//Propeller.increaseSpeed();
//increaseSpeed