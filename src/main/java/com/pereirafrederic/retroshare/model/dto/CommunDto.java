package com.pereirafrederic.retroshare.model.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommunDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2461033255031169805L;
	
	@NotNull
	private Long id;

	/*
	 * @Past
	 * 
	 * @NotNull private LocalDateTime dateCreation;
	 * 
	 * @Past private LocalDateTime datemodification;
	 */
}
