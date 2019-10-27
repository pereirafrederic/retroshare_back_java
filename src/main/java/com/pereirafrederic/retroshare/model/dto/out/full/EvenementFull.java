package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.NomPeriodeDto;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.dto.out.light.ThemeLight;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;
import com.pereirafrederic.retroshare.model.enums.EvenementStatut;

@Getter
@Setter
@NoArgsConstructor
public class EvenementFull extends NomPeriodeDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private UtilisateurLight organisateur;

	@NotNull
	private EvenementStatut statut;

	@NotNull
	private ThemeLight theme;

	private String description;

	private LieuFull lieu;

	private NomDto holding;

	private List<PlaceLight> places = new ArrayList<>();
	private List<NotationLight> notations = new ArrayList<>();

}
