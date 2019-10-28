package com.pereirafrederic.retroshare.model.dto.in;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotationCommunForm extends UpdateIdForm {

	@NotNull
	private int note;
	

	@NotNull
	private Long idUtilisateur;

}
