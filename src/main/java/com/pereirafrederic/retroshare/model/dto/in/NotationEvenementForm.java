package com.pereirafrederic.retroshare.model.dto.in;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotationEvenementForm extends NotationCommunForm {

	@NotNull
	private Long idEvenement;

}
