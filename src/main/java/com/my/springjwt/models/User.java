package com.my.springjwt.models;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
//@Table(name = "users", 
@Table(name = "doctors",    
	uniqueConstraints = { 
      @UniqueConstraint(columnNames = "username"),
      @UniqueConstraint(columnNames = "email") 
    })
public class User {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	 
	 @NotBlank
	 @Size(max = 20)
	 private String firstname;
	 
	 @NotBlank
	 @Size(max = 20)
	 private String lastname;
	 
	 @NotBlank
	  @Size(max = 20)
	  private String username;

	  @NotBlank
	  @Size(max = 50)
	  @Email
	  private String email;

	  @NotBlank
	  @Size(max = 120)
	  private String password;
	  
	  @NotBlank
	  @Size(max = 120)
	  private String confirmpassword;
	  
	  @NotBlank
	  @Size(max = 120)
	  private String hospital;
	  
	  @NotBlank
	  @Size(max = 120)
	  private String specialty;

	  @ManyToMany(fetch = FetchType.LAZY)
	  @JoinTable(  name = "user_roles", 
	        joinColumns = @JoinColumn(name = "user_id"), 
	        inverseJoinColumns = @JoinColumn(name = "role_id"))
	  private Set<Role> roles = new HashSet<>();

	  public User() {
	  }

	  public User(String firstname, String lastname, String username, String email, String password,
			  String confirmpassword, String hospital, String specialty) {
	    this.firstname = firstname;
	    this.lastname = lastname;
		  this.username = username;
	    this.email = email;
	    this.password = password;
	    this.confirmpassword = confirmpassword;
	    this.hospital = hospital;
	    this.specialty = specialty;
	  }

	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }
	  
	  
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

	public Set<Role> getRoles() {
	    return roles;
	  }

	  public void setRoles(Set<Role> roles) {
	    this.roles = roles;
	  }
}
