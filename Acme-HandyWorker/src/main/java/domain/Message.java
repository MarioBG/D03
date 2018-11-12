
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.apache.log4j.Priority;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Message extends DomainEntity {

	private Date		moment;
	private String		subject;
	private String		body;
	private Priority	priority;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@NotBlank
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	@Pattern(regexp = "^NEUTRAL|HIGH|LOW$")
	public Priority getPriority() {
		return this.priority;
	}

	public void setPriority(final Priority priority) {
		this.priority = priority;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Actor>	recipients;
	private Actor				sender;
	private Box					box;


	@NotNull
	@Valid
	@ManyToMany
	public Collection<Actor> getRecipients() {
		return this.recipients;
	}

	public void setRecipients(final Collection<Actor> recipients) {
		this.recipients = recipients;
	}

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Actor getSender() {
		return this.sender;
	}

	public void setSender(final Actor sender) {
		this.sender = sender;
	}

	@NotNull
	@Valid
	@ManyToOne(optional = true)
	public Box getBox() {
		return this.box;
	}

	public void setBox(final Box box) {
		this.box = box;
	}

}
