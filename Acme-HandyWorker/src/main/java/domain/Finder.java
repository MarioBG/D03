
package domain;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
public class Finder extends DomainEntity {

	private String	keyWord;
	private Double	minPrice;
	private Double	maxPrice;
	private Date	startDate;
	private Date	endDate;
	private Date	lastSearchDate;


	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(final String keyWord) {
		this.keyWord = keyWord;
	}

	public Double getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(final Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final Double maxPrice) {
		this.maxPrice = maxPrice;
	}

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

	public Date getLastSearchDate() {
		return this.lastSearchDate;
	}

	public void setLastSearchDate(final Date lastSearchDate) {
		this.lastSearchDate = lastSearchDate;
	}


	// --------------------------------------- RELATIONSHIPS

	private Collection<FixUpTask>	fixUpTasks;


	public void setFixUpTasks(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

	@Valid
	@OneToMany
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

}
