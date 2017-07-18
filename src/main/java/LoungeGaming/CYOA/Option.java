package LoungeGaming.CYOA;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Option {

	@Id
	@GeneratedValue
	private long id;

	@Lob
	String text;

	@ManyToOne
	Option parent;

	@OneToMany(mappedBy = "parent")
	Collection<Option> nextOptions;

	public String getText() {
		return text;
	}

	public Option getParent() {
		return parent;
	}

	public Collection<Option> getNextOptions() {
		return nextOptions;
	}

	public Option(String text, Option parent, Collection<Option> nextOptions) {
		this.text = text;
		this.parent = parent;
		this.nextOptions = nextOptions;
	}

	public Option() {

	}

}
