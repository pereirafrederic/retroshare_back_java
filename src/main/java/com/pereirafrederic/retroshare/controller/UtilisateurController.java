package com.pereirafrederic.retroshare.controller;

import java.util.AbstractCollection;

import org.mapstruct.ReportingPolicy;
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
import com.pereirafrederic.retroshare.model.mapper.UtilisateurMapper;
import com.pereirafrederic.retroshare.service.UtilisateurService;

@RestController
@RequestMapping("utilisateur")
public class UtilisateurController extends AbstractController {

	@Autowired
	private UtilisateurService service;

	@GetMapping()
	public AbstractCollection<UtilisateurFull> getAll() {
		return UtilisateurMapper.INSTANCE.toArrayFullDto(service.getAll());
	}

	@GetMapping(value = "/{id}")
	public UtilisateurFull get(@PathVariable(value = "id") Long id) {
		return UtilisateurMapper.INSTANCE.toFullDto(service.get(id));
	}

	@PostMapping
	public UtilisateurFull post(@RequestBody UtilisateurForm in) {
		return UtilisateurMapper.INSTANCE.toFullDto(service.post(in));
	}

	@PutMapping
	public UtilisateurFull put(@RequestBody UtilisateurForm in) {
		return UtilisateurMapper.INSTANCE.toFullDto(service.put(in));
	}

	@DeleteMapping(value = "/{id")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}

}
