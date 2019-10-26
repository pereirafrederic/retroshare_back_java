package com.pereirafrederic.retroshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pereirafrederic.retroshare.model.dto.in.NotationForm;
import com.pereirafrederic.retroshare.model.dto.out.full.NotationFull;
import com.pereirafrederic.retroshare.model.mapper.NotationMapper;
import com.pereirafrederic.retroshare.service.NotationService;

@RequestMapping("notation")
public class NotationController extends AbstractController {

	private static final NotationMapper MAPPER = NotationMapper.INSTANCE;

	@Autowired
	private NotationService service;

	@GetMapping(value = "/{id}")
	public NotationFull get(@PathVariable(value = "id") Long id) {
		return MAPPER.toFullDto(service.get(id));
	}

	@PostMapping
	public NotationFull post(@RequestBody NotationForm in) {
		return MAPPER.toFullDto(service.post(in));
	}

	@PutMapping
	public NotationFull put(@RequestBody NotationForm in) {
		return MAPPER.toFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
