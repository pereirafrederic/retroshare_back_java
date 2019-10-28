package com.pereirafrederic.retroshare.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pereirafrederic.retroshare.model.dto.in.EvenementForm;
import com.pereirafrederic.retroshare.model.entite.Evenement;
import com.pereirafrederic.retroshare.model.entite.Notation;
import com.pereirafrederic.retroshare.repository.EvenementRepo;

@Service
public class EvenementService extends AbstractService {

	@Autowired
	private EvenementRepo repo;

	@Transactional(readOnly = true)
	public ArrayList<Evenement> getAll() {
		return (ArrayList<Evenement>) repo.findAll();
	}

	@Transactional(readOnly = true)
	public Evenement get(Long id) {
		return repo.findById(id).orElseThrow(() -> {
			return new RuntimeException();
		});
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Evenement post(EvenementForm in) {

		Evenement entity = new Evenement();
		/*
		 * UtilisateurMapper.mapper.toEntity(in, entity); entity =
		 * repo.save(entity);
		 */

		return entity;
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Evenement put(EvenementForm in) {

		return new Evenement();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void delete(Long id) {
		Evenement entity = get(id);

		repo.delete(entity);
	}

}
