package com.pereirafrederic.retroshare.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pereirafrederic.retroshare.model.dto.in.PlaceForm;
import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.entite.Place;
import com.pereirafrederic.retroshare.repository.PlaceRepo;

@Service
public class PlaceService {

	@Autowired
	private PlaceRepo repo;

	@Transactional(readOnly = true)
	public ArrayList<Place> getAll() {
		return (ArrayList<Place>) repo.findAll();
	}

	@Transactional(readOnly = true)
	public Place get(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException());
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
		Place entity = get(id);

		repo.delete(entity);
	}

}
