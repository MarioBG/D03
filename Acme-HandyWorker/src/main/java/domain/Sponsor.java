
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
public class Sponsor extends Actor {

	// Relationships ----------------------------------------------------------

	private Collection<Sponsorship>	sponsorships;


	@Valid
	@OneToMany
	public Collection<Sponsorship> getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(final Collection<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
