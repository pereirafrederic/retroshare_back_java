package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import com.pereirafrederic.retroshare.model.dto.CommunDto;
import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;

@Getter
@Setter
@AllArgsConstructor
public class LieuFull extends CommunDto {

	@NotBlank
	@NotNull
	private String nom;

	private float Latitude;
	private float Longitude;

	private List<EvenementLight> evenements = new ArrayList<>();;

	private List<NomDto> holdings = new ArrayList<>();;

}
