package survive;

/**
 * @author root
 *
 */
public class Karma {
	private Tihi tihi;
	
	public Karma() {
		tihi = new Tihi();
	}
	
	protected void addHP(int add) {
		tihi.addHP(add);
	}
	
	protected void subHP(int sub) {
		tihi.subHP(sub);
	}
	protected void setHP2MAX() {
		tihi.setHP2MAX();
	}
}
