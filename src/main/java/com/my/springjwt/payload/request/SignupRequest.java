package com.my.springjwt.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {
	
	@NotBlank
	@Size(min=6, max=40)
	private String firstname;
	
	@NotBlank
	@Size(min=6, max=40)
	private String lastname;
	
	@NotBlank
	  @Size(min = 3, max = 20)
	  private String username;

	  @NotBlank
	  @Size(max = 50)
	  @Email
	  private String email;

	  private Set<String> role;

	  @NotBlank
	  @Size(min = 6, max = 40)
	  private String password;
	  
	  @NotBlank
	  @Size(min = 6, max = 40)
	  private String confirmpassword;
	  
	  @NotBlank
	  @Size(min = 6, max = 40)
	  private String hospital;
	  
	  @NotBlank
	  @Size(min = 6, max = 40)
	  private String specialty;

	  public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }
	  
	  public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Set<String> getRole() {
	    return this.role;
	  }

	  public void setRole(Set<String> role) {
	    this.role = role;
	  }
}
