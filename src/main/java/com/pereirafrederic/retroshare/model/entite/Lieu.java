package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "lieu")
public class Lieu extends AbstractCommun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2442971198064315715L;

	@NotBlank
	@NotNull
	private String nom;

	private float Latitude;
	private float Longitude;

	@OneToMany(targetEntity = Evenement.class, fetch = FetchType.LAZY, mappedBy = "lieu")
	private List<Evenement> evenements;

}
