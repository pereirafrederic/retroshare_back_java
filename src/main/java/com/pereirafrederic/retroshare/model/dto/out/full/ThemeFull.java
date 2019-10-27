package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;

@Getter
@Setter
@NoArgsConstructor
public class ThemeFull extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9092961385274047314L;

	@NotBlank
	@NotNull
	private String theme;

	// private image

	private List<EvenementLight> evenements;
}
