package com.pereirafrederic.retroshare.model.dto.out.full;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.CommunDto;

@Getter
@Setter
@NoArgsConstructor
public class NotationFull extends CommunDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6865352891580697812L;

	@NotNull
	private UtilisateurFull utilisateur;

	private PlaceFull place;

	private EvenementFull evenement;

	@NotNull
	private int note = 0;

}
