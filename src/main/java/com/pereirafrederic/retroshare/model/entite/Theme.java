package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@Table(name = "theme")
public class Theme extends AbstractCommun {

	private String theme;
	private String nom;
	// private image
	
	@OneToMany(targetEntity = Evenement.class, fetch = FetchType.LAZY, mappedBy = "theme")
	private List<Evenement> evenements;

}
