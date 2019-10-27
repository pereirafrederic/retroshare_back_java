package com.pereirafrederic.retroshare.model.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "holding")
public class Holding extends AbstractCommun {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8891891176719786575L;

	@NotNull
	@NotBlank
	private String nom;

	@OneToMany(targetEntity = Evenement.class, fetch = FetchType.LAZY, mappedBy = "holding")
	private List<Evenement> evenements;

}
