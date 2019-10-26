package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import com.pereirafrederic.retroshare.model.dto.CommunDto;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UtilisateurLight extends CommunDto {

	@NotNull
	@NotBlank
	private String nom;

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
