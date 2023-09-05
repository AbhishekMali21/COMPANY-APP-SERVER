package com.innoventes.test.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

	@NotNull(message = "Company name is mandatory")
	@NotEmpty(message = "Company name is mandatory")
	@Size(min = 5, message = "Company name must be at least 5 characters long")
	private String companyName;

	@NotNull(message = "Email is mandatory")
	@NotEmpty(message = "Email is mandatory")
	@Email(message = "Email should be a valid email address")
	private String email;

	@PositiveOrZero(message = "Strength should be a positive number or zero")
	private Integer strength;
	
	@URL(message = "Website URL should be a valid URL")
	private String webSiteURL;
	
	@Pattern(regexp = "[A-Za-z]{2}[0-9]{2}[e|E|n|N]")
	private String companyCode;
}
