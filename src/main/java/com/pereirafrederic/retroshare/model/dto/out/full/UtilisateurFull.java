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

import org.joda.time.LocalDate;

import com.pereirafrederic.retroshare.model.dto.CommunDto;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.validation.date.Age;
import com.pereirafrederic.retroshare.model.validation.date.Past;
import com.pereirafrederic.retroshare.model.validation.phone.Phone;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UtilisateurFull extends CommunDto {

	private String nom;

	@NotNull
	@NotBlank
	private String pseudo;

	@NotNull
	@Past
	@Age(min = 18, max = 100)
	private LocalDate dateNaissance;

	@NotNull
	@NotBlank
	private String email;

	@NotNull
	@NotBlank
	@Phone
	private String numeroTelephone;

	private String description;

	private List<NotationLight> notations = new ArrayList<>();;
	private List<PlaceLight> places = new ArrayList<>();;

}
