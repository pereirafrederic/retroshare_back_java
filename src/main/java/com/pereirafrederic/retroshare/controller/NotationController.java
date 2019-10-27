package com.pereirafrederic.retroshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pereirafrederic.retroshare.service.NotationService;

@RestController
@RequestMapping("notation")
public class NotationController extends AbstractDtoController {

	@Autowired
	private NotationService service;
	/*
	 * @GetMapping(value = "/{id}") public NotationFull get(@PathVariable(value
	 * = "id") Long id) { return map(service.get(id), NotationFull.class); }
	 * 
	 * @PostMapping public NotationFull post(@RequestBody NotationForm in) {
	 * return map(service.post(in), NotationFull.class); }
	 * 
	 * @PutMapping public NotationFull put(@RequestBody NotationForm in) {
	 * return map(service.put(in), NotationFull.class); }
	 * 
	 * @DeleteMapping(value = "/{id") public void delete(@PathVariable(value =
	 * "id") Long id) { service.delete(id); }
	 */

}
