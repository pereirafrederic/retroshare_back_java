package com.pereirafrederic.retroshare.model.dto.out.light;

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
import com.pereirafrederic.retroshare.model.enums.EvenementStatut;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class EvenementLight extends CommunDto {

	@NotBlank
	@NotNull
	private String nom;

	@NotNull
	private UtilisateurLight organisateur;

	@NotNull
	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	@NotNull
	private EvenementStatut statut = EvenementStatut.EN_CONSTRUCTION;

	private String description;

	private LieuLight lieu;

	private NomDto holding;

	@NotNull
	private ThemeLight theme;

}
