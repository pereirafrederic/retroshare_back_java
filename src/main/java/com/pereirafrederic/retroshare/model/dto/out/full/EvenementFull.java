package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;

@Getter
@Setter
@NoArgsConstructor
public class EvenementFull extends EvenementLight {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<PlaceLight> places = new ArrayList<>();
	private List<NotationLight> notations = new ArrayList<>();

}
