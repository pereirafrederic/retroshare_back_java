package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;

import com.pereirafrederic.retroshare.model.converter.LocalDateConverter;

@Getter
@Setter
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractCommun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7336679705566760154L;

	@NotNull
	@NotBlank
	private String nom;

	private String pseudo;

	@NotNull
	@Convert(converter = LocalDateConverter.class)
	private DateTime dateNaissance;

	@NotNull
	@NotBlank
	private String email;

	@NotNull
	@NotBlank
	private String numeroTelephone;

	private String description;

	@OneToMany(targetEntity = Place.class, fetch = FetchType.LAZY, mappedBy = "utilisateur")
	private List<Place> places;

	@OneToMany(targetEntity = Notation.class, fetch = FetchType.LAZY, mappedBy = "utilisateur")
	private List<Notation> notations;

}
