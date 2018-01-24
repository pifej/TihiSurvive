package survive.tile;

import survive.Karma;

/**
 * @author root
 *
 */
public abstract class Tile extends Karma implements Cloneable{
	protected String type;
	
	abstract void Action();
	
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

