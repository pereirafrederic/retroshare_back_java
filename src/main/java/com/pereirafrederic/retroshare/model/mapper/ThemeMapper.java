package com.pereirafrederic.retroshare.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pereirafrederic.retroshare.model.dto.in.ThemeForm;
import com.pereirafrederic.retroshare.model.dto.out.full.ThemeFull;
import com.pereirafrederic.retroshare.model.dto.out.light.ThemeLight;
import com.pereirafrederic.retroshare.model.entite.Theme;

@Service
public class ThemeMapper {
	
	@Autowired
	private EvenementMapper evenementMapper;

	
	public ThemeLight mapToLightDto(Theme input) {
		if(input == null){
			return null;
		}
		ThemeLight output = new ThemeLight();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setTheme(input.getTheme());
		return   output;
	}
	
	public ThemeFull mapToFullDto(Theme input) {

		if (input == null) {
			return null;
		}

		ThemeFull output = new ThemeFull();
		output.setId(input.getId());
		output.setNom(input.getNom());
		output.setTheme(input.getTheme());
		output.setEvenements(evenementMapper.mapListToLight(input.getEvenements()));
		return output;
	}

	public List<ThemeFull> mapListToFull(List<Theme> input) {
		if (input == null) {
			return null;
		}

		List<ThemeFull> output = new ArrayList<>();

		for (Theme element : input) {
			output.add(mapToFullDto(element));
		}

		return output;
	}
	
	public Theme mapFormToEntity(ThemeForm input) {
		Theme output = new Theme();
		output.setNom(input.getNom());
		output.setTheme(input.getTheme());
		return output;
	}
	
	

}
