/**
 * 
 */
package survive.tile;

/**
 * @author root
 *
 */
public class Obstacle extends Tile {

	public Obstacle() {
		super.type = "Obstacle";
	}
	
	@Override
	void Action() {
		// Tihi cannot move to an obstacle

	}

}
