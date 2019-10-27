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
public class LieuFull extends NomDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8982109029203148831L;
	
	
	private float Latitude;
	private float Longitude;

	private List<EvenementLight> evenements;

	private List<NomDto> holdings;

}
