package LoungeGaming.CYOA;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Npc {

	@Id
	private long id;
	
	private String name;
	private String imageUrl;
	private Map<Integer, String> dialogue = new HashMap<Integer, String>();
	
	public Map<Integer, String> getDialogue() {
		return dialogue;
	}

	public void setDialogue(int key, String newDialogue) {
		dialogue.put(key, newDialogue);
	}

	public Npc() {
		
	}
	
	public Npc(long id, String name, String imageUrl) {
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}


}
