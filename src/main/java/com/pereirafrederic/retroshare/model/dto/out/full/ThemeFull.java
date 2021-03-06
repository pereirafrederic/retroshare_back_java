package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.ThemeLight;

@Getter
@Setter
@NoArgsConstructor
public class ThemeFull extends ThemeLight {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9092961385274047314L;

	// private image

	private List<EvenementLight> evenements;
}
