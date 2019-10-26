package com.pereirafrederic.retroshare.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pereirafrederic.retroshare.model.dto.in.PlaceForm;
import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.entite.Place;

@Service
public class PlaceService {

	@Transactional(readOnly = true)
	public ArrayList<Place> getAll() {
		return new ArrayList<Place>();
	}

	@Transactional(readOnly = true)
	public Place get(Long id) {
		return new Place();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Place post(UtilisateurForm in) {

		return new Place();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Place put(PlaceForm in) {

		return new Place();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void delete(Long id) {

	}

}
