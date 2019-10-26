package com.pereirafrederic.retroshare.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NomDto extends CommunDto {

	@NotBlank
	@NotNull
	private String nom;

}
