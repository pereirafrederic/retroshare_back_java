package com.pereirafrederic.retroshare.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pereirafrederic.retroshare.model.entite.Place;

@Repository
public interface PlaceRepo extends CrudRepository<Place, Long>,
		PagingAndSortingRepository<Place, Long>,
		JpaSpecificationExecutor<Place> {

}
