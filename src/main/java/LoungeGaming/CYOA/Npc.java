package LoungeGaming.CYOA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Npc {

	@Id
	private long id;
	
	private String name;
	private String imageUrl;
	
	
	@OneToMany (mappedBy= "npc")
	private Set<Dialogue> dialogues;
	
	public Set<Dialogue> getDialogues(){
		return dialogues;
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
