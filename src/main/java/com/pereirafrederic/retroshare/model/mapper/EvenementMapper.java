package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.EvenementForm;
import com.pereirafrederic.retroshare.model.dto.out.full.EvenementFull;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.entite.Evenement;

@Service
public class EvenementMapper {
	
	@Autowired
	private HoldingMapper holdingMapper;
	
	@Autowired
	private UtilisateurMapper utilisateurMapper;
	
	@Autowired
	private ThemeMapper themeMapper;
	
	public EvenementLight mapToLightDto(Evenement input) {
		if (input == null) {
			return null;
		}
		EvenementLight output = new EvenementLight();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setDescription(input.getDescription());
		output.setStatut(input.getStatut());
		output.setDateDebut(input.getDateDebut());
		output.setDateFin(input.getDateFin());
		
		output.setHolding(holdingMapper.mapToLightDto(input.getHolding()));
		output.setOrganisateur(utilisateurMapper.mapToLightDto(input.getOrganisateur()));
		output.setTheme(themeMapper.mapToLightDto(input.getTheme()));
		return output;
	}
	
	public EvenementFull mapToFullDto(Evenement input) {

		if (input == null) {
			return null;
		}

		EvenementFull output = new EvenementFull();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setDescription(input.getDescription());
		output.setStatut(input.getStatut());
		output.setDateDebut(input.getDateDebut());
		output.setDateFin(input.getDateFin());
		
		output.setHolding(holdingMapper.mapToLightDto(input.getHolding()));
		output.setOrganisateur(utilisateurMapper.mapToLightDto(input.getOrganisateur()));
		output.setTheme(themeMapper.mapToLightDto(input.getTheme()));
		
		output.setPlaces(new ArrayList<PlaceLight>());
		
		return output;
	}
	

	public List<EvenementLight> mapListToLight(List<Evenement> input) {
		if (input == null) {
			return null;
		}

		List<EvenementLight> output = new ArrayList<>();

		for (Evenement element : input) {
			output.add(mapToLightDto(element));
		}

		return output;
	}

	public List<EvenementFull> mapListToFull(List<Evenement> input) {
		if (input == null) {
			return null;
		}

		List<EvenementFull> output = new ArrayList<>();

		for (Evenement element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Evenement mapFormToEntity(EvenementForm input) {
		return new Evenement();
	}
	
	

}
