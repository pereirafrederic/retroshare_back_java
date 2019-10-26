package com.pereirafrederic.retroshare.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pereirafrederic.retroshare.model.dto.in.NotationForm;
import com.pereirafrederic.retroshare.model.entite.Notation;

@Service
public class NotationService {

	@Transactional(readOnly = true)
	public ArrayList<Notation> getAll() {
		return new ArrayList<Notation>();
	}

	@Transactional(readOnly = true)
	public Notation get(Long id) {
		return new Notation();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Notation post(NotationForm in) {

		return new Notation();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public Notation put(NotationForm in) {

		return new Notation();
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void delete(Long id) {

	}

}
