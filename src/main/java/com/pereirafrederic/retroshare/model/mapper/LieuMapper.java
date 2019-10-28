package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.in.LieuForm;
import com.pereirafrederic.retroshare.model.dto.out.full.LieuFull;
import com.pereirafrederic.retroshare.model.dto.out.light.LieuLight;
import com.pereirafrederic.retroshare.model.entite.Lieu;

@Service
public class LieuMapper {
	
	@Autowired
	private EvenementMapper evenementMapper;

	
	public NomDto mapToLightDto(Lieu input) {
		if(input == null){
			return null;
		}
		LieuLight output = new LieuLight();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setLatitude(input.getLatitude());
		output.setLongitude(input.getLongitude());
		return  output;
	}
	
	public LieuFull mapToFullDto(Lieu input) {

		if (input == null) {
			return null;
		}

		LieuFull output = new LieuFull();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setLatitude(input.getLatitude());
		output.setLongitude(input.getLongitude());
		
		output.setEvenements(evenementMapper.mapListToLight(input.getEvenements()));
		return output;
	}

	public List<LieuFull> mapListToFull(List<Lieu> input) {
		if (input == null) {
			return null;
		}

		List<LieuFull> output = new ArrayList<>();

		for (Lieu element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Lieu mapFormToEntity(LieuForm input) {
		Lieu output = new Lieu();
		output.setNom(input.getNom());
		output.setLongitude(input.getLongitude());
		output.setLatitude(input.getLatitude());
		return output;
	}
	
	

}
