package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.in.HoldingForm;
import com.pereirafrederic.retroshare.model.dto.out.full.HoldingFull;
import com.pereirafrederic.retroshare.model.entite.Holding;

@Service
public class HoldingMapper {

	@Autowired
	private EvenementMapper evenementMapper;
	
	public NomDto mapToLightDto(Holding input) {
		if(input == null){
			return null;
		}
		NomDto output = new NomDto();
		output.setId(input.getId());
		output.setNom(input.getNom());
		return   output;
	}
	
	public HoldingFull mapToFullDto(Holding input) {

		if (input == null) {
			return null;
		}

		HoldingFull output = new HoldingFull();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setEvenements(evenementMapper.mapListToLight(input.getEvenements()));
		
		return output;
	}

	public List<NomDto> mapListToLight(List<Holding> input) {
		if (input == null) {
			return null;
		}

		List<NomDto> output = new ArrayList<>();

		for (Holding element : input) {
			output.add(mapToLightDto(element));
		}

		return output;
	}
	public List<HoldingFull> mapListToFull(List<Holding> input) {
		if (input == null) {
			return null;
		}

		List<HoldingFull> output = new ArrayList<>();

		for (Holding element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Holding mapFormToEntity(HoldingForm input) {
		Holding output = new Holding();
		output.setNom(input.getNom());
		return output;
	}
	
	

}
