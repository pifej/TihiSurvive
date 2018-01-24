/**
 * 
 */
package survive.tile;

/**
 * @author root
 *
 */
public class Rest extends Tile {

	public Rest() {
		super.type = "Rest";
	}
	
	@Override
	void Action() {
		
		// TODO Tihi cannot move for a while and gets maxHP
		
		
		
		super.setHP2MAX();
	}

}
