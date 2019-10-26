package com.pereirafrederic.retroshare.model.dto.in;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class NotationForm {
	
	@NotNull
	private Long  idPlace;
	
	@NotNull
	private Long idUtilisateur;
	
	@NotNull
	private int note;

}
