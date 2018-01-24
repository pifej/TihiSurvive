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
	
	public static Tile getTile(String type) {
		Tile cachedTile = tileMap.get(type);
		return (Tile)cachedTile.clone();
	}
	
	public static void loadCache() {
		
	}

}
