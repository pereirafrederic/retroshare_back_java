package com.pereirafrederic.retroshare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pereirafrederic.retroshare.model.dto.in.PlaceForm;
import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.dto.out.full.PlaceFull;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.PlaceLight;
import com.pereirafrederic.retroshare.model.mapper.PlaceMapper;
import com.pereirafrederic.retroshare.service.PlaceService;

@RestController
@RequestMapping("place")
public class PlaceController extends AbstractDtoController {

	@Autowired
	private PlaceService service;
	
	@Autowired
	private PlaceMapper mapper;
	
	@GetMapping
	public List<PlaceLight> getAll() {
		return mapper.mapListToLight(service.getAll());
	}

	@GetMapping(value = "/{id}")
	public PlaceFull get(@PathVariable(value = "id") Long id) {
		return mapper.mapToFullDto(service.get(id));
	}

	@PostMapping
	public PlaceFull post(@RequestBody UtilisateurForm in) {
		return mapper.mapToFullDto(service.post(in));
	}

	@PutMapping
	public PlaceFull put(@RequestBody PlaceForm in) {
		return mapper.mapToFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
