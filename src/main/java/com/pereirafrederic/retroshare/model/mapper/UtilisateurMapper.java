package com.pereirafrederic.retroshare.model.mapper;

import java.util.AbstractCollection;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.EvenementForm;
import com.pereirafrederic.retroshare.model.dto.out.full.EvenementFull;
import com.pereirafrederic.retroshare.model.dto.out.full.UtilisateurFull;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Mapper
public interface UtilisateurMapper {

	UtilisateurMapper INSTANCE = Mappers.getMapper(UtilisateurMapper.class);

	AbstractCollection<UtilisateurFull> toArrayFullDto(
			AbstractCollection<Utilisateur> entites);

	UtilisateurFull toFullDto(Utilisateur entite);

	UtilisateurLight toLightDto(Utilisateur entite);

	@InheritInverseConfiguration
	Utilisateur toEntity(EvenementFull dto);

	@InheritInverseConfiguration
	Utilisateur toEntity(EvenementForm dto);

}
