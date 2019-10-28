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

import com.pereirafrederic.retroshare.model.dto.in.NotationPlaceForm;
import com.pereirafrederic.retroshare.model.dto.out.full.NotationFull;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.dto.out.light.NotationLight;
import com.pereirafrederic.retroshare.model.mapper.NotationMapper;
import com.pereirafrederic.retroshare.service.NotationService;

@RestController
@RequestMapping("notation")
public class NotationController extends AbstractDtoController {

	@Autowired
	private NotationService service;
	@Autowired
	private NotationMapper mapper;
	
	@GetMapping
	public List<NotationLight> getAll() {
		return mapper.mapListToLight(service.getAll());
	}

	@GetMapping(value = "/{id}")
	public NotationFull get(@PathVariable(value = "id") Long id) {
		return mapper.mapToFullDto(service.get(id));
	}

	@PostMapping
	public NotationFull post(@RequestBody NotationPlaceForm in) {
		return mapper.mapToFullDto(service.post(in));
	}

	@PutMapping
	public NotationFull put(@RequestBody NotationPlaceForm in) {
		return mapper.mapToFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
