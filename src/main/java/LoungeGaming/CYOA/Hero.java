package LoungeGaming.CYOA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hero {
	
	@Id
	private long id = 1;
	
	public String name;
	private String dialogue1;
	private String imageUrl;
	
	// "health points" or "hit points"
	private int hp;
	
/**************************
 * Constructors
 *************************/
	
    public Hero() {
    	
    }
    
    public Hero(long id, String name, int hp, String dialogue1, String imageUrl) {
    	this.id = id;
    	this.name = name;
    	this.hp = hp;
    	this.dialogue1 = dialogue1;
    	this.imageUrl = imageUrl;
    }

public Hero(String name) {
		this.name=name;
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
	public void add(Hero hero) {
		hero.add(hero);
	}
	
}
