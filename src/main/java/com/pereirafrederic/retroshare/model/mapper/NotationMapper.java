package com.pereirafrederic.retroshare.model.mapper;

import java.util.AbstractCollection;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.NotationForm;
import com.pereirafrederic.retroshare.model.dto.out.full.NotationFull;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.entite.Notation;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotationMapper {

	NotationMapper INSTANCE = Mappers.getMapper(NotationMapper.class);

	AbstractCollection<NotationFull> toArrayFullDto(
			AbstractCollection<Notation> entites);

	NotationFull toFullDto(Notation entite);

	NotationLight toLightDto(Notation entite);

	@InheritInverseConfiguration
	Utilisateur toEntity(NotationFull dto);

	@InheritInverseConfiguration
	Notation toEntity(NotationForm dto);

}
