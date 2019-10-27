package com.pereirafrederic.retroshare.model.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.LocalDateTime;

@Getter
@Setter
public class PeriodeDto extends CommunDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3746978908839781906L;

	@NotNull
	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

}
