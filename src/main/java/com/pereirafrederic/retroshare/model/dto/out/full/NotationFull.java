package com.pereirafrederic.retroshare.model.dto.out.full;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;

@Getter
@Setter
@NoArgsConstructor
public class NotationFull extends NotationLight {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6865352891580697812L;

	@NotNull
	private UtilisateurLight juge;


}
