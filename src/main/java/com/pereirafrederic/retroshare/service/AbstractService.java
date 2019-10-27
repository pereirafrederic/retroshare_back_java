package com.pereirafrederic.retroshare.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractService {

	@PersistenceContext
	protected EntityManager em;

}
