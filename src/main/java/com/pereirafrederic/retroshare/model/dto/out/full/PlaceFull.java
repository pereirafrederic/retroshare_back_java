package com.pereirafrederic.retroshare.model.dto.out.full;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import com.pereirafrederic.retroshare.model.dto.CommunDto;
import com.pereirafrederic.retroshare.model.enums.PlaceMotifRefus;
import com.pereirafrederic.retroshare.model.enums.PlaceStatut;
import com.pereirafrederic.retroshare.model.enums.PlaceType;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PlaceFull extends CommunDto {

	private UtilisateurFull utilisateur;

	@NotNull
	private EvenementFull evenement;

	@NotNull
	private PlaceType typePlace;

	@NotNull
	private PlaceStatut statut = PlaceStatut.LIBRE;

	private PlaceMotifRefus motifRefus;

	private float prix;

}
