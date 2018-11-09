
package domain;

import java.util.Collection;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class HandyWorker extends Actor {

	private String	make;


	@NotBlank
	public String getMake() {
		return this.make;
	}

	public void setMake(final String make) {
		this.make = make;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Application>	applications;
	private Collection<Tutorial>	tutorials;
	private Collection<Endorsement>	endorsements;


	@Valid
	public Collection<Application> getApplications() {
		return this.applications;
	}

	public void setApplication(final Collection<Application> applications) {
		this.applications = applications;
	}

	@Valid
	public Collection<Tutorial> getTutorials() {
		return this.tutorials;
	}

	public void setTutorials(final Collection<Tutorial> tutorials) {
		this.tutorials = tutorials;
	}

	@Valid
	public Collection<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Collection<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
