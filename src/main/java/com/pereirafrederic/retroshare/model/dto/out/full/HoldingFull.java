package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;

@Getter
@Setter
@NoArgsConstructor
public class HoldingFull extends NomDto {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3960185947017092761L;
	
	
	private List<EvenementLight> evenements;


}
