package com.pereirafrederic.retroshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pereirafrederic.retroshare.service.EvenementService;

@RestController
@RequestMapping("evenement")
public class EvenementController extends AbstractDtoController {

	@Autowired
	private EvenementService service;

	/*
	 * @GetMapping public List<EvenementFull> getAll() { return
	 * null;///mapList(service.getAll(), EvenementFull.class); }
	 * 
	 * @GetMapping(value = "/{id}") public EvenementFull get(@PathVariable(value
	 * = "id") Long id) { return map(service.get(id), EvenementFull.class); }
	 * 
	 * @PostMapping public EvenementFull post(@RequestBody EvenementForm in) {
	 * return map(service.post(in), EvenementFull.class); }
	 * 
	 * @PutMapping public EvenementFull put(@RequestBody EvenementForm in) {
	 * return map(service.put(in), EvenementFull.class); }
	 * 
	 * @DeleteMapping(value = "/{id") public void delete(@PathVariable(value =
	 * "id") Long id) { service.delete(id); }
	 */
}
