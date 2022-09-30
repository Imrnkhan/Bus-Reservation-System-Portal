package com.root.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userLoginId;
	
	@NotNull(message = "Username should not be null")
	private String userName;
	
	@NotNull(message="password should not be null")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$")
	private String password;
	
	@NotNull(message = "Name should not be null")
	private String firstName;
	
	private String lastName;
	

//	@Pattern(regexp = "[0-9]{10}", message = "Mobile No is Invalid")
	private Long contact;
	
	@Email
	private String email;


	
}
