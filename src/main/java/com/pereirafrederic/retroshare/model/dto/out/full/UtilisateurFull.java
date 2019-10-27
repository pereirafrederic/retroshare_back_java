package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.validation.date.Age;
import com.pereirafrederic.retroshare.model.validation.date.Past;
import com.pereirafrederic.retroshare.model.validation.phone.Phone;

@Getter
@Setter
@JsonRootName("utilisateur")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class UtilisateurFull extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -558313627291565581L;

	@NotNull
	@NotBlank
	private String pseudo;

	@NotNull
	@Past
	@Age(min = 18, max = 100)
	@JsonFormat(pattern = "YYYY-mm-dd")
	private DateTime dateNaissance;

	@NotNull
	@NotBlank
	private String email;

	@NotNull
	@NotBlank
	@Phone
	private String numeroTelephone;

	private String description;

	private List<NotationLight> notations;
	private List<PlaceLight> places;

}
