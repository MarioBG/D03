
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
public class Customer extends Actor {

	// Relationships ----------------------------------------------------------

	private Collection<FixUpTask>	fixUpTasks;
	private Collection<Endorsement>	endorsements;


	@Valid
	@OneToMany
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

	@Valid
	@OneToMany
	public Collection<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Collection<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
