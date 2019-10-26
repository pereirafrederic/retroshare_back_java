package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.CommunDto;

@Getter
@Setter
@AllArgsConstructor
public class LieuLight extends CommunDto {

	@NotBlank
	@NotNull
	private String nom;

	private float Latitude;
	private float Longitude;

}
