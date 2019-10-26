package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.joda.time.LocalDateTime;

import com.pereirafrederic.retroshare.model.enums.EvenementStatut;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "evenement", schema = "retroshare")
public class Evenement extends AbstractCommun {

	@NotBlank
	@NotNull
	private String nom;

	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "utilisateur_id", referencedColumnName = "id", nullable = false)
	private Utilisateur organisateur;

	@NotNull
	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	@NotNull
	@Enumerated(EnumType.STRING)
	private EvenementStatut statut;

	private String description;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "lieu_id", referencedColumnName = "id", nullable = false)
	private Lieu lieu;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "holding_id", referencedColumnName = "id", nullable = false)
	private Holding holding;

	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "theme_id", referencedColumnName = "id", nullable = false)
	private Theme theme;
	
	
	@OneToMany(targetEntity = Place.class, fetch = FetchType.LAZY, mappedBy = "evenement")
	private List<Place> places;
	
	@OneToMany(targetEntity = Notation.class, fetch = FetchType.LAZY, mappedBy = "evenement")
	private List<Notation> notations;
	
	

}
