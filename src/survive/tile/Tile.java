package survive.tile;

import survive.Karma;

/**
 * @author root
 *
 */
public abstract class Tile extends Karma implements Cloneable{
	private int id;
	protected String type;
	
	abstract void Action();
	
	int getId() {return this.id;}
	String getType() {return this.type;}
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
	        e.printStackTrace();
		}
	      
	    return clone;
	}

}

