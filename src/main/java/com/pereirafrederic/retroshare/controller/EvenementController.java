package com.pereirafrederic.retroshare.controller;

import java.util.AbstractCollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pereirafrederic.retroshare.model.dto.in.EvenementForm;
import com.pereirafrederic.retroshare.model.dto.out.full.EvenementFull;
import com.pereirafrederic.retroshare.model.mapper.EvenementMapper;
import com.pereirafrederic.retroshare.service.EvenementService;

@RequestMapping("evenement")
public class EvenementController extends AbstractController {

	private static final EvenementMapper MAPPER = EvenementMapper.INSTANCE;
	@Autowired
	private EvenementService service;

	@GetMapping
	public AbstractCollection<EvenementFull> getAll() {
		return MAPPER.toArrayFullDto(service.getAll());
	}

	@GetMapping(value = "/{id}")
	public EvenementFull get(@PathVariable(value = "id") Long id) {
		return MAPPER.toFullDto(service.get(id));
	}

	@PostMapping
	public EvenementFull post(@RequestBody EvenementForm in) {
		return MAPPER.toFullDto(service.post(in));
	}

	@PutMapping
	public EvenementFull put(@RequestBody EvenementForm in) {
		return MAPPER.toFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
