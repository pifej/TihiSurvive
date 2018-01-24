/**
 * 
 */
package survive.tile;


/**
 * @author root
 *
 */
public class Food extends Tile {

	public Food() {
		super.type = "Food";
	}
	
	@Override
	void Action() {
		super.addHP(25);
	}

}
