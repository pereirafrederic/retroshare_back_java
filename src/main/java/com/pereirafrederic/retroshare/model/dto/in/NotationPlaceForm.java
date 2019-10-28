package com.pereirafrederic.retroshare.model.dto.in;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotationPlaceForm extends NotationCommunForm {

	@NotNull
	private Long idPlace;

}
