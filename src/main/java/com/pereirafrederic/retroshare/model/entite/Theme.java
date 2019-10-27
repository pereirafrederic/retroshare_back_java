package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "theme")
public class Theme extends AbstractCommun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3571449387437065060L;
	private String theme;
	private String nom;
	// private image

	@OneToMany(targetEntity = Evenement.class, fetch = FetchType.LAZY, mappedBy = "theme")
	private List<Evenement> evenements;

}
