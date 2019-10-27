package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.CommunDto;
import com.pereirafrederic.retroshare.model.enums.PlaceMotifRefus;
import com.pereirafrederic.retroshare.model.enums.PlaceStatut;
import com.pereirafrederic.retroshare.model.enums.PlaceType;

@Getter
@Setter
@NoArgsConstructor
public class PlaceLight extends CommunDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4846942403310862562L;

	private UtilisateurLight utilisateur;

	@NotNull
	private EvenementLight evenement;

	@NotNull
	private PlaceType typePlace;

	@NotNull
	private PlaceStatut statut;

	private PlaceMotifRefus motifRefus;

	@Positive
	private float prix;

}
