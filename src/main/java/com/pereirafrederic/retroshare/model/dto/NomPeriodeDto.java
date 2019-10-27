package com.pereirafrederic.retroshare.model.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.LocalDateTime;

@Getter
@Setter
public class NomPeriodeDto extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8233660620942464849L;

	@NotNull
	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

}
