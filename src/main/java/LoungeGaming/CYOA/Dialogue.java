package LoungeGaming.CYOA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Dialogue {
	
@Id
private long id;

@Lob
private String content;	
	
@ManyToOne
private Npc npc;

public Npc getNpc() {
	return npc;
}

public String getContent() {
	return content;
}

public Dialogue(Npc npc, long id, String content) {
	this.npc = npc;
	this.id=id;
	this.content = content;
}

public Dialogue () {
}
}
