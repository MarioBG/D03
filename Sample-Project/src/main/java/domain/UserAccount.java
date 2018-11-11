
package domain;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import security.Authority;

public class UserAccount extends DomainEntity {

	private String	username;
	private String	password;


	@NotBlank
	@Size(min = 5, max = 32)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	@NotBlank
	@Size(min = 5, max = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}


	// Relationships ----------------------------------------------------------

	private Collection<Authority>	authority;


	@NotNull
	@Valid
	@ElementCollection
	public Collection<Authority> getAuthority() {
		return this.authority;
	}

	public void setAuthority(final Collection<Authority> authority) {
		this.authority = authority;
	}

}
