package LoungeGaming.CYOA;

import javax.persistence.Entity;

@Entity
public class Npc {

	private String name;
	private String imageUrl;
	
	public Npc() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String imageUrl() {
		return imageUrl;
	}


}
