package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.NomPeriodeDto;
import com.pereirafrederic.retroshare.model.enums.EvenementStatut;

@Getter
@Setter
@NoArgsConstructor
public class EvenementLight extends NomPeriodeDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2725173972599112953L;

	@NotNull
	private UtilisateurLight organisateur;

	@NotNull
	private EvenementStatut statut;

	private String description;

	private LieuLight lieu;

	private NomDto holding;

	@NotNull
	private ThemeLight theme;

}
