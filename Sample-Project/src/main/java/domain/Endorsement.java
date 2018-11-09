
package domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Past;

public class Endorsement extends DomainEntity {

	private Date	moment;
	private String	comment;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}


	// Relationships ----------------------------------------------------------

	private Customer	customer;
	private HandyWorker	handyWorker;


	@Valid
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	@Valid
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

}
