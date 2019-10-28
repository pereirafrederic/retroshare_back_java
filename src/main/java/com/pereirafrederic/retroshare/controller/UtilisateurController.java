package com.pereirafrederic.retroshare.controller;

import java.util.ArrayList;
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

import com.pereirafrederic.retroshare.model.dto.in.UtilisateurForm;
import com.pereirafrederic.retroshare.model.dto.out.full.UtilisateurFull;
import com.pereirafrederic.retroshare.model.dto.out.light.UtilisateurLight;
import com.pereirafrederic.retroshare.model.entite.Utilisateur;
import com.pereirafrederic.retroshare.model.mapper.UtilisateurMapper;
import com.pereirafrederic.retroshare.service.UtilisateurService;

@RestController
@RequestMapping("utilisateur")
public class UtilisateurController extends AbstractDtoController {

	@Autowired
	private UtilisateurService service;

	@Autowired
	private UtilisateurMapper mapper;

	@GetMapping()
	public List<UtilisateurLight> getAll() {
		return mapper.mapListToLight(service.getAll());
	}

	@GetMapping(value = "/{id}")
	public UtilisateurFull get(@PathVariable(value = "id") Long id) {
		return mapper.mapToFullDto(service.get(id));
	}

	@PostMapping
	public UtilisateurFull post(@RequestBody UtilisateurForm in) {
		return mapper.mapToFullDto(service.post(in));
	}

	@PutMapping
	public UtilisateurFull put(@RequestBody UtilisateurForm in) {
		return mapper.mapToFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
