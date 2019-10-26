package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDateTime;

import com.pereirafrederic.retroshare.model.dto.CommunDto;
import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.dto.out.light.ThemeLight;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;
import com.pereirafrederic.retroshare.model.enums.EvenementStatut;
import com.pereirafrederic.retroshare.model.validation.date.Future;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class EvenementFull extends CommunDto {

	@NotBlank
	@NotNull
	private String nom;

	@NotNull
	private UtilisateurLight organisateur;

	@NotNull
	private EvenementStatut statut = EvenementStatut.EN_CONSTRUCTION;

	@NotNull
	private ThemeLight theme;

	@NotNull
	@Future
	private LocalDateTime dateDebut;

	@Future
	private LocalDateTime dateFin;

	private String description;

	private LieuFull lieu;

	private NomDto holding;

	private List<PlaceLight> places = new ArrayList<>();
	private List<NotationLight> notations = new ArrayList<>();

}
