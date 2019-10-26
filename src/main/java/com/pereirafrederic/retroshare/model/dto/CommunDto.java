package com.pereirafrederic.retroshare.model.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.LocalDateTime;

import com.pereirafrederic.retroshare.model.validation.date.Past;

@Getter
@Setter
public class CommunDto {

	@NotNull
	private Long id;

	@Past
	@NotNull
	private LocalDateTime dateCreation;

	@Past
	private LocalDateTime datemodification;
}
