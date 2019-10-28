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

import com.pereirafrederic.retroshare.model.dto.in.EvenementForm;
import com.pereirafrederic.retroshare.model.dto.out.full.EvenementFull;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;
import com.pereirafrederic.retroshare.model.mapper.EvenementMapper;
import com.pereirafrederic.retroshare.service.EvenementService;

@RestController
@RequestMapping("evenement")
public class EvenementController extends AbstractDtoController {

	@Autowired
	private EvenementService service;
	
	@Autowired
	private EvenementMapper mapper;

	@GetMapping
	public List<EvenementLight> getAll() {
		return mapper.mapListToLight(service.getAll());
	}

	@GetMapping(value = "/{id}")
	public EvenementFull get(@PathVariable(value = "id") Long id) {
		return mapper.mapToFullDto(service.get(id));
	}

	@PostMapping
	public EvenementFull post(@RequestBody EvenementForm in) {
		return mapper.mapToFullDto(service.post(in));
	}

	@PutMapping
	public EvenementFull put(@RequestBody EvenementForm in) {
		return mapper.mapToFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
