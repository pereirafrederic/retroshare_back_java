package com.pereirafrederic.retroshare.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Service
public class UtilisateurService {

	@Transactional(readOnly = true)
	public ArrayList<Utilisateur> getAll() {
		return new ArrayList<Utilisateur>();
	}

	@Transactional(readOnly = true)
	public Utilisateur get(Long id) {
		return new Utilisateur();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Utilisateur post(UtilisateurForm in) {

		return new Utilisateur();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Utilisateur put(UtilisateurForm in) {

		return new Utilisateur();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void delete(Long id) {

	}

}
