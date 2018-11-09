
package domain;

import java.sql.Date;
import java.util.Collection;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class EducationRecord extends DomainEntity {

	private String				diplomaTitle;
	private String				institutionName;
	private Collection<String>	comments;
	private Date				startDate;
	private Date				endDate;
	private String				attachmentURL;


	@NotBlank
	public String getDiplomaTitle() {
		return this.diplomaTitle;
	}

	public void setDiplomaTitle(final String diplomaTitle) {
		this.diplomaTitle = diplomaTitle;
	}

	@NotBlank
	public String getInstitutionName() {
		return this.institutionName;
	}

	public void setInstitutionName(final String institutionName) {
		this.institutionName = institutionName;
	}

	public Collection<String> getComment() {
		return this.comments;
	}

	public void setComment(final Collection<String> comment) {
		this.comments = comment;
	}

	@Past
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

	@URL
	public String getAttachmentURL() {
		return this.attachmentURL;
	}

	public void setAttachmentURL(final String attachmentURL) {
		this.attachmentURL = attachmentURL;
	}

}
