
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import security.UserAccount;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Actor extends DomainEntity {

	private String	name;
	private String	middleName;
	private String	surname;
	private String	email;
	private String	photo;
	private String	phoneNumber;
	private String	address;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@Pattern(regexp = "^[a-A-Z0-9]+@[a-zA-Z09.]*|[a-zA-Z0-9]+<[a-zA-Z0-9]+@[a-zA-Z0-9.]*>$")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}


	// Relationships ----------------------------------------------------------

	private UserAccount					userAccount;
	private Collection<SocialIdentity>	socialIdentity;
	private Collection<Box>				box;


	@Valid
	@NotNull
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(final UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Valid
	public Collection<SocialIdentity> getSocialIdentity() {
		return this.socialIdentity;
	}

	public void setSocialIdentity(final Collection<SocialIdentity> socialIdentity) {
		this.socialIdentity = socialIdentity;
	}

	@Valid
	public Collection<Box> getBox() {
		return this.box;
	}

	public void setBox(final Collection<Box> box) {
		this.box = box;
	}

}
