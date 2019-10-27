package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.CommunDto;

@Getter
@Setter
@NoArgsConstructor
public class NotationLight extends CommunDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5989892137155884991L;

	@NotNull
	private UtilisateurLight utilisateur;

	private PlaceLight place;

	private EvenementLight evenement;

	@NotNull
	private int note = 0;

}
