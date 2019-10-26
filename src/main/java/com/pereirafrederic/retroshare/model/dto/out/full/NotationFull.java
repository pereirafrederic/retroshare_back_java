package com.pereirafrederic.retroshare.model.dto.out.full;

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
public class NotationFull extends CommunDto {

	@NotNull
	private UtilisateurFull utilisateur;

	private PlaceFull place;

	private EvenementFull evenement;

	@NotNull
	private int note = 0;

}
