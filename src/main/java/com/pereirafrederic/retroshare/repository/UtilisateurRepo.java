package com.pereirafrederic.retroshare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pereirafrederic.retroshare.model.entite.Evenement;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Repository
public interface UtilisateurRepo extends CrudRepository<Utilisateur, Long>,PagingAndSortingRepository<Utilisateur, Long>,
		JpaSpecificationExecutor<Utilisateur> {


}
