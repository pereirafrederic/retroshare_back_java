package com.pereirafrederic.retroshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pereirafrederic.retroshare.service.PlaceService;

@RestController
@RequestMapping("place")
public class PlaceController extends AbstractDtoController {

	@Autowired
	private PlaceService service;
	/*
	 * @GetMapping(value = "/{id}") public PlaceFull get(@PathVariable(value =
	 * "id") Long id) { return map(service.get(id), PlaceFull.class); }
	 * 
	 * @PostMapping public PlaceFull post(@RequestBody UtilisateurForm in) {
	 * return map(service.post(in), PlaceFull.class); }
	 * 
	 * @PutMapping public PlaceFull put(@RequestBody PlaceForm in) { return
	 * map(service.put(in), PlaceFull.class); }
	 * 
	 * @DeleteMapping(value = "/{id") public void delete(@PathVariable(value =
	 * "id") Long id) { service.delete(id); }
	 */

}
