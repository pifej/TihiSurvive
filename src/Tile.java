import java.util.ArrayList;

/**
 * @author root
 *
 */
public class Tile extends Karma implements Cloneable{
	private int Id;
	private String Type;
	private ArrayList<String> validTypes = new ArrayList<String>();
	
	public Tile(int id, String type) throws IllegalArgumentException{
		addValidTypes();
		if(!this.validTypes.contains(type)) {
			throw new IllegalArgumentException(type+" is not a valid type!");
		}
		this.Id = id;
		this.Type = type;
	}
	
	void addValidTypes() {
		this.validTypes.add("water");
		this.validTypes.add("food");
		this.validTypes.add("obstacle");
		this.validTypes.add("rest");
	}
	
	void Action() {
		
	}
	
	int getId() {return this.Id;}
	String getType() {return this.Type;}
	
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

