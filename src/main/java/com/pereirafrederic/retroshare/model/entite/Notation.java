package com.pereirafrederic.retroshare.model.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notation")
public class Notation extends AbstractCommun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8178816785461872462L;

	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "juge_id", referencedColumnName = "id", nullable = false)
	private Utilisateur juge;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "place_id", referencedColumnName = "id", nullable = true)
	private Place place;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "evenement_id", referencedColumnName = "id", nullable = true)
	private Evenement evenement;

	@NotNull
	private int note = 0;

}
