/**
 * @author root
 *
 */
public class Tihi {
	private int HP;
	private int maxHP;
	//Tile myTile;
	
	public Tihi() {
		this.HP = 100;
		this.maxHP = 100;
	}
	
	void Move(String direction) {
		
	}
	
	void death() {
		
	}
	
	void addHP(int add) {
		int newValue = this.HP+add;
		if(newValue > this.maxHP) {
			newValue = this.maxHP;
		}else {
			this.HP = newValue;
		}
	}
	
	void subHP(int sub) {
		int newValue = this.HP-sub;
		if(newValue < 0) {
			death();
		}else {
			this.HP = newValue;
		}
	}
	
	int getHP() {return this.HP;}
	int getMaxHP() {return this.maxHP;}
}
