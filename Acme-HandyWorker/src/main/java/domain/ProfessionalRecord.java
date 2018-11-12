
package domain;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class ProfessionalRecord extends DomainEntity {

	private String				companyName;
	private Date				startDate;
	private Date				endDate;
	private String				playedRole;
	private Collection<String>	comment;
	private String				attachmentURL;


	@NotBlank
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	@Past
	@NotNull
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@NotBlank
	public String getPlayedRole() {
		return this.playedRole;
	}

	public void setPlayedRole(final String playedRole) {
		this.playedRole = playedRole;
	}

	public Collection<String> getComments() {
		return this.comment;
	}

	public void setComments(final Collection<String> comment) {
		this.comment = comment;
	}

	@URL
	public String getAttachmentURL() {
		return this.attachmentURL;
	}

	public void setAttachmentURL(final String attachmentURL) {
		this.attachmentURL = attachmentURL;
	}

}
