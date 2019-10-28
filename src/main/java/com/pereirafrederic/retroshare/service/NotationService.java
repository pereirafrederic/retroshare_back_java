package com.pereirafrederic.retroshare.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pereirafrederic.retroshare.model.dto.in.NotationPlaceForm;
import com.pereirafrederic.retroshare.model.entite.Notation;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;
import com.pereirafrederic.retroshare.repository.NotationRepo;

@Service
public class NotationService {
	
	@Autowired
	private NotationRepo repo;

	@Transactional(readOnly = true)
	public ArrayList<Notation> getAll() {
		return (ArrayList<Notation>) repo.findAll();
	}

	@Transactional(readOnly = true)
	public Notation get(Long id) {
		return repo.findById(id).orElseThrow( () -> new RuntimeException("aucun element trouvé pour id="+ id));
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Notation post(NotationPlaceForm in) {

		return new Notation();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Notation put(NotationPlaceForm in) {

		return new Notation();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void delete(Long id) {
		Notation entity = get(id);

		repo.delete(entity);
	}

}
