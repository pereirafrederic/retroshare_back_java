package com.pereirafrederic.retroshare.model.dto.out.full;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;

@Getter
@Setter
@NoArgsConstructor
public class PlaceFull extends PlaceLight {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4152986795883230113L;

	private UtilisateurLight utilisateur;

	@NotNull
	private EvenementLight evenement;

}
