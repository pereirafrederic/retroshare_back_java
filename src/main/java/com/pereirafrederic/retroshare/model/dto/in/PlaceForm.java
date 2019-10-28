package com.pereirafrederic.retroshare.model.dto.in;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.enums.PlaceType;

@Getter
@Setter
public class PlaceForm extends UpdateIdForm{
	
	@NotNull
	private Long idEvenement;
	
	@NotNull
	private PlaceType typePlace;
	

	@Positive
	private float prix;

}
