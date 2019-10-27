package com.pereirafrederic.retroshare.model.dto.out.full;

import javax.validation.constraints.NotNull;

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
public class PlaceFull extends CommunDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4152986795883230113L;

	private UtilisateurFull utilisateur;

	@NotNull
	private EvenementFull evenement;

	@NotNull
	private PlaceType typePlace;

	@NotNull
	private PlaceStatut statut;

	private PlaceMotifRefus motifRefus;

	private float prix;

}
