package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.NomDto;
import com.pereirafrederic.retroshare.model.dto.in.NotationCommunForm;
import com.pereirafrederic.retroshare.model.dto.in.NotationEvenementForm;
import com.pereirafrederic.retroshare.model.dto.in.NotationPlaceForm;
import com.pereirafrederic.retroshare.model.dto.out.full.NotationFull;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.entite.Evenement;
import com.pereirafrederic.retroshare.model.entite.Notation;
import com.pereirafrederic.retroshare.model.entite.Place;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Service
public class NotationMapper {

	@Autowired
	private EvenementMapper evenementMapper;
	
	@Autowired
	private PlaceMapper placeMapper;
	@Autowired
	private UtilisateurMapper utilisateurMapper;

	
	public NotationLight mapToLightDto(Notation input) {
		if(input == null){
			return null;
		}
		NotationLight output = new NotationLight();
		output.setId(input.getId());
		output.setNote(input.getNote());
		output.setEvenement(evenementMapper.mapToLightDto(input.getEvenement()));
		output.setPlace(placeMapper.mapToLightDto(input.getPlace()));
		return   output;
	}
	
	public NotationFull mapToFullDto(Notation input) {

		if (input == null) {
			return null;
		}

		NotationFull output = new NotationFull();
		output.setId(input.getId());
		output.setNote(input.getNote());
		output.setEvenement(evenementMapper.mapToLightDto(input.getEvenement()));
		output.setPlace(placeMapper.mapToLightDto(input.getPlace()));
		
		output.setJuge(utilisateurMapper.mapToLightDto(input.getJuge()));
		
		return output;
	}

	public List<NotationLight> mapListToLight(List<Notation> input) {
		if (input == null) {
			return null;
		}

		List<NotationLight> output = new ArrayList<>();

		for (Notation element : input) {
			output.add(mapToLightDto(element));
		}

		return output;
	}
	public List<NotationFull> mapListToFull(List<Notation> input) {
		if (input == null) {
			return null;
		}

		List<NotationFull> output = new ArrayList<>();

		for (Notation element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Notation mapFormToEntity(NotationPlaceForm input, Utilisateur utilisateur, Place place) {
		Notation output = mapFormToEntityCommun(input.getNote(), utilisateur);
		output.setPlace(place);
		return output;
	}
	
	public Notation mapFormToEntity(NotationEvenementForm input, Utilisateur utilisateur, Evenement evenement) {
		Notation output = mapFormToEntityCommun(input.getNote(), utilisateur);
		output.setEvenement(evenement);
		return output;
	}

	private Notation mapFormToEntityCommun(int note,
			Utilisateur juge) {
		Notation output = new Notation();

		output.setNote(note);
		output.setJuge(juge);
		return output;
	}
	
	

}
