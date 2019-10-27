package com.pereirafrederic.retroshare.model.dto.out.light;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.NomDto;

@Getter
@Setter
@NoArgsConstructor
public class LieuLight extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1415417184384313823L;
	private float Latitude;
	private float Longitude;

}
