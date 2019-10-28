package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.PlaceForm;
import com.pereirafrederic.retroshare.model.dto.out.full.PlaceFull;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.entite.Evenement;
import com.pereirafrederic.retroshare.model.entite.Place;
import com.pereirafrederic.retroshare.model.enums.PlaceStatut;

@Service
public class PlaceMapper {

	@Autowired
	private EvenementMapper evenementMapper;
	
	@Autowired
	private UtilisateurMapper utilisateurMapper;

	
	public PlaceLight mapToLightDto(Place input) {
		if(input == null){
			return null;
		}
		PlaceLight output = new PlaceLight();
		output.setId(input.getId());
		output.setTypePlace(input.getTypePlace());
		output.setStatut(input.getStatut());
		output.setPrix(input.getPrix());
		output.setMotifRefus(input.getMotifRefus());
		return  output;
	}
	
	public PlaceFull mapToFullDto(Place input) {

		if (input == null) {
			return null;
		}

		PlaceFull output = new PlaceFull();
		output.setId(input.getId());
		output.setTypePlace(input.getTypePlace());
		output.setStatut(input.getStatut());
		output.setPrix(input.getPrix());
		output.setMotifRefus(input.getMotifRefus());
		
		
		output.setEvenement(evenementMapper.mapToLightDto(input.getEvenement()));
		output.setUtilisateur(utilisateurMapper.mapToLightDto(input.getUtilisateur()));
		return output;
	}

	public List<PlaceLight> mapListToLight(List<Place> input) {
		if (input == null) {
			return null;
		}

		List<PlaceLight> output = new ArrayList<>();

		for (Place element : input) {
			output.add(mapToLightDto(element));
		}

		return output;
	}
	public List<PlaceFull> mapListToFull(List<Place> input) {
		if (input == null) {
			return null;
		}

		List<PlaceFull> output = new ArrayList<>();

		for (Place element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Place mapFormToEntity(PlaceForm input, Evenement evenement) {
		Place output = new Place();
		output.setPrix(input.getPrix());
		
		output.setEvenement(evenement);
		output.setStatut(PlaceStatut.LIBRE);
		output.setTypePlace(input.getTypePlace());
		return output;
	}
	
	

}
