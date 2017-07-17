package LoungeGaming.CYOA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Character {
	
	@Id
	private long id;
	
	private String name;
	private String dialogue1;
	private String imageUrl;
	
	// "health points" or "hit points"
	private int hp;
	
/**************************
 * Constructors
 *************************/
	
    public Character() {
    	
    }
    
    public Character(long id, String name, int hp, String dialogue1, String imageUrl) {
    	this.id = id;
    	this.name = name;
    	this.hp = hp;
    	this.dialogue1 = dialogue1;
    	this.imageUrl = imageUrl;
    }

/*****************************
 * Get Methods
 *****************************/
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public String getDialogue1() {
		return dialogue1;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
}
