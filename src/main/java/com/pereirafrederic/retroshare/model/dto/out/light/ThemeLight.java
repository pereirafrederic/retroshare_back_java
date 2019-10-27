package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.NomDto;

@Getter
@Setter
@NoArgsConstructor
public class ThemeLight extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2742310533979442148L;
	
	@NotBlank
	@NotNull
	private String theme;

	// private image

}
