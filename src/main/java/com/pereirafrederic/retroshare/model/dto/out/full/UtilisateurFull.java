package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;

@Getter
@Setter
@JsonRootName("utilisateur")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class UtilisateurFull extends UtilisateurLight {
	/**
	 * 
	 */
	private static final long serialVersionUID = -558313627291565581L;

	@NotNull
	@NotBlank
	private String pseudo;


	private List<NotationLight> notations;
	private List<PlaceLight> places;

}
