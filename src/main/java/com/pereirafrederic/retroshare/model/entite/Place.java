package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.enums.PlaceMotifRefus;
import com.pereirafrederic.retroshare.model.enums.PlaceStatut;
import com.pereirafrederic.retroshare.model.enums.PlaceType;

@Getter
@Setter
@Entity
@Table(name = "place")
public class Place extends AbstractCommun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8569803870330725554L;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "utilisateur_id", referencedColumnName = "id", nullable = false)
	private Utilisateur utilisateur;

	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "evenement_id", referencedColumnName = "id", nullable = false)
	private Evenement evenement;

	@NotNull
	@Enumerated(EnumType.STRING)
	private PlaceType typePlace;

	@NotNull
	@Enumerated(EnumType.STRING)
	private PlaceStatut statut;

	@Enumerated(EnumType.STRING)
	private PlaceMotifRefus motifRefus;

	@Positive
	private float prix;

	@OneToMany(targetEntity = Notation.class, fetch = FetchType.LAZY, mappedBy = "place")
	private List<Notation> notations;

}
