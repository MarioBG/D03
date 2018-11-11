
package domain;

import java.util.Collection;

import javax.persistence.OneToMany;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	private String	name;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Category>	childCategories;


	@Valid
	@OneToMany
	public Collection<Category> getChildCategories() {
		return this.childCategories;
	}

	public void setChildCategories(final Collection<Category> childCategories) {
		this.childCategories = childCategories;
	}

}
