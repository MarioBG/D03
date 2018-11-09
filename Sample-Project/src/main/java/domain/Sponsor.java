
package domain;

import java.util.Collection;

import javax.validation.Valid;

public class Sponsor extends Actor {

	// Relationships ----------------------------------------------------------

	private Collection<Sponsorship>	sponsorships;


	@Valid
	public Collection<Sponsorship> getSponsorships() {
		return this.sponsorships;
	}

	public void setSponsorships(final Collection<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}

}
