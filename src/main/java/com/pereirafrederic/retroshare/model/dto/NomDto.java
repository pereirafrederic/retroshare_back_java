package com.pereirafrederic.retroshare.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NomDto extends CommunDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4869649043281021535L;
	
	
	@NotBlank
	@NotNull
	private String nom;

}
