
package domain;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
public class Finder extends DomainEntity {

	private String		keyWord;
	private Double		minPrice;
	private Double		maxPrice;
	private Date		startDate;
	private Date		endDate;
	private Date		lastSearchDate;
	private Warranty	warranty;
	private Category	category;


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

	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	@Valid
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
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
