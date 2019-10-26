package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

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
public class PlaceLight extends CommunDto {

	private UtilisateurLight utilisateur;

	@NotNull
	private EvenementLight evenement;

	@NotNull
	private PlaceType typePlace;

	@NotNull
	private PlaceStatut statut = PlaceStatut.LIBRE;

	private PlaceMotifRefus motifRefus;

	@Positive
	private float prix;

}
