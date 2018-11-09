
package domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	private String				title;
	private Date				updateTime;
	private String				summary;
	private Collection<String>	pictures;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@Past
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(final Date updateTime) {
		this.updateTime = updateTime;
	}

	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@URL
	public Collection<String> getPictures() {
		return this.pictures;
	}

	public void setPictures(final Collection<String> pictures) {
		this.pictures = pictures;
	}


	// Relationships ----------------------------------------------------------

	private List<Section>	sections;


	@Valid
	public List<Section> getSections() {
		return this.sections;
	}

	public void setSections(final List<Section> sections) {
		this.sections = sections;
	}

}
