package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.pereirafrederic.retroshare.model.dto.NomDto;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@JsonRootName("Utilisateur")
@JsonPropertyOrder(alphabetic = true)
public class UtilisateurLight extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1179885087222053679L;

	private String pseudo;

	@NotNull
	private LocalDate dateNaissance;

	@NotNull
	@NotBlank
	private String email;

	@NotNull
	@NotBlank
	private String numeroTelephone;

	private String description;

}
