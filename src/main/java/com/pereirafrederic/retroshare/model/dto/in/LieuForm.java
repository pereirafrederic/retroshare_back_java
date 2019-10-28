package com.pereirafrederic.retroshare.model.dto.in;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LieuForm {
	
	@NotBlank
	@NotNull
	private String nom;
	
	private float Latitude;
	private float Longitude;
}
