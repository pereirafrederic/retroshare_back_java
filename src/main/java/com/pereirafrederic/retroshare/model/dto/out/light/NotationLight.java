package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import com.pereirafrederic.retroshare.model.dto.CommunDto;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class NotationLight extends CommunDto {

	@NotNull
	private UtilisateurLight utilisateur;

	private PlaceLight place;

	private EvenementLight evenement;

	@NotNull
	private int note = 0;

}
