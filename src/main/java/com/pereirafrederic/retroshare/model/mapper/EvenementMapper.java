package com.pereirafrederic.retroshare.model.mapper;

import java.util.AbstractCollection;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.EvenementForm;
import com.pereirafrederic.retroshare.model.dto.out.full.EvenementFull;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.entite.Evenement;

@Mapper
public interface EvenementMapper {

	EvenementMapper INSTANCE = Mappers.getMapper(EvenementMapper.class);

	AbstractCollection<EvenementFull> toArrayFullDto(
			AbstractCollection<Evenement> entites);

	EvenementFull toFullDto(Evenement entite);

	EvenementLight toLightDto(Evenement entite);

	@InheritInverseConfiguration
	Evenement toEntity(EvenementFull dto);

	Evenement toEntity(EvenementForm dto);

}
