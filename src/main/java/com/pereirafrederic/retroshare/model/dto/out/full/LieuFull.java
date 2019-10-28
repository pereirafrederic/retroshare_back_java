package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.LieuLight;

@Getter
@Setter
@NoArgsConstructor
public class LieuFull extends LieuLight {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8982109029203148831L;


	private List<EvenementLight> evenements;

}
