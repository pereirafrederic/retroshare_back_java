package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.dto.out.full.UtilisateurFull;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Service
public class UtilisateurMapper {

	@Autowired
	private PlaceMapper placeMapper;

	
	public UtilisateurLight mapToLightDto(Utilisateur input) {
		if (input == null) {
			return null;
		}
		UtilisateurLight output = new UtilisateurLight();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setPseudo(input.getPseudo());
		output.setDateNaissance(input.getDateNaissance());
		output.setDescription(input.getDescription());
		output.setEmail(input.getEmail());
		output.setNumeroTelephone(input.getNumeroTelephone());
		return  output;
	}
	
	public UtilisateurFull mapToFullDto(Utilisateur input) {

		if (input == null) {
			return null;
		}

		UtilisateurFull output = new UtilisateurFull();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setPseudo(input.getPseudo());
		output.setDateNaissance(input.getDateNaissance());
		output.setDescription(input.getDescription());
		output.setEmail(input.getEmail());
		output.setNumeroTelephone(input.getNumeroTelephone());
		
		output.setNotations(new ArrayList<NotationLight>());
		output.setPlaces(placeMapper.mapListToLight(input.getPlaces()));
		
		return output;
	}

	public List<UtilisateurLight> mapListToLight(List<Utilisateur> input) {
		if (input == null) {
			return null;
		}

		List<UtilisateurLight> output = new ArrayList<>();

		for (Utilisateur element : input) {
			output.add(mapToLightDto(element));
		}

		return output;
	}

	public List<UtilisateurFull> mapListToFull(List<Utilisateur> input) {
		if (input == null) {
			return null;
		}

		List<UtilisateurFull> output = new ArrayList<>();

		for (Utilisateur element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Utilisateur mapFormToEntity(UtilisateurForm input) {
		return new Utilisateur();
	}
	
	

}
