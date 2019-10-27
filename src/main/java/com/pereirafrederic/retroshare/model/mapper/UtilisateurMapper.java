package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.out.full.UtilisateurFull;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Service
public class UtilisateurMapper {

	public UtilisateurFull toFullDto(Utilisateur in) {

		UtilisateurFull out = new UtilisateurFull();
		out.setDateNaissance(in.getDateNaissance());
		out.setDescription(in.getDescription());
		out.setEmail(in.getEmail());
		out.setId(in.getId());
		out.setNom(in.getNom());
		out.setNotations(new ArrayList<NotationLight>());
		out.setNumeroTelephone(in.getNumeroTelephone());
		out.setPlaces(new ArrayList<PlaceLight>());
		out.setPseudo(in.getPseudo());
		return out;

	}

}
