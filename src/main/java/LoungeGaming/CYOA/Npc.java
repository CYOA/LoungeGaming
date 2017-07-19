package LoungeGaming.CYOA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Npc {

	@Id
	@GeneratedValue
	private long id;
	
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
