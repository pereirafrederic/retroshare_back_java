package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractCommun {

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
	
	@OneToMany(targetEntity = Place.class, fetch = FetchType.LAZY, mappedBy = "utilisateur")
	private List<Place> places;
	
	@OneToMany(targetEntity = Notation.class, fetch = FetchType.LAZY, mappedBy = "utilisateur")
	private List<Notation> notations;
	

}
