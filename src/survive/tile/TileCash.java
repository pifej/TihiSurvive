/**
 * 
 */
package survive.tile;

import java.util.Hashtable;

/**
 * For prototype design pattern
 * @author root
 *
 */
public class TileCash {
	private static Hashtable<String, Tile> tileMap = new Hashtable<String, Tile>();
	
	/**
	 * Gets the clone of a given class
	 * @param type type of the class we want to clone
	 * @return	the cloned class
	 */
	public static Tile getTile(String type) {
		Tile cachedTile = tileMap.get(type);
		return (Tile)cachedTile.clone();
	}
	
	/**
	 * Loads the instance of the subclasses into a hash table
	 */
	public static void loadCache() {
		Food food = new Food();
		tileMap.put(food.type, food);
		
		Regular regular = new Regular();
		tileMap.put(regular.type, regular);
		
		Obstacle obstacle = new Obstacle();
		tileMap.put(obstacle.type, obstacle);
		
		Water water = new Water();
		tileMap.put(water.type, water);
		
		Rest rest = new Rest();
		tileMap.put(rest.type, rest);
		
		Paradise paradise = new Paradise();
		tileMap.put(paradise.type, paradise);
	}

}
