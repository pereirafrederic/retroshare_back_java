package com.pereirafrederic.retroshare.model.mapper;

import java.util.AbstractCollection;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.PlaceForm;
import com.pereirafrederic.retroshare.model.dto.out.full.PlaceFull;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.entite.Place;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;

@Mapper
public interface PlaceMapper {

	PlaceMapper INSTANCE = Mappers.getMapper(PlaceMapper.class);

	AbstractCollection<PlaceFull> toArrayFullDto(
			AbstractCollection<Place> entites);

	PlaceFull toFullDto(Place entite);

	PlaceLight toLightDto(Place entite);

	@InheritInverseConfiguration
	Utilisateur toEntity(PlaceFull dto);

	@InheritInverseConfiguration
	Place toEntity(PlaceForm dto);

}
