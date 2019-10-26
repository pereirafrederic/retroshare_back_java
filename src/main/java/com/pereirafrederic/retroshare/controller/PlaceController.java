package com.pereirafrederic.retroshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pereirafrederic.retroshare.model.dto.in.PlaceForm;
import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.dto.out.full.PlaceFull;
import com.pereirafrederic.retroshare.model.mapper.PlaceMapper;
import com.pereirafrederic.retroshare.service.PlaceService;

@RequestMapping("place")
public class PlaceController extends AbstractController {

	private static final PlaceMapper MAPPER = PlaceMapper.INSTANCE;
	@Autowired
	private PlaceService service;

	@GetMapping(value = "/{id}")
	public PlaceFull get(@PathVariable(value = "id") Long id) {
		return MAPPER.toFullDto(service.get(id));
	}

	@PostMapping
	public PlaceFull post(@RequestBody UtilisateurForm in) {
		return MAPPER.toFullDto(service.post(in));
	}

	@PutMapping
	public PlaceFull put(@RequestBody PlaceForm in) {
		return MAPPER.toFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
