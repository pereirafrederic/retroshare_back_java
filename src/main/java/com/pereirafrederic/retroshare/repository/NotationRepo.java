package com.pereirafrederic.retroshare.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pereirafrederic.retroshare.model.entite.Notation;

@Repository
public interface NotationRepo extends CrudRepository<Notation, Long>,
		PagingAndSortingRepository<Notation, Long>,
		JpaSpecificationExecutor<Notation> {

}
