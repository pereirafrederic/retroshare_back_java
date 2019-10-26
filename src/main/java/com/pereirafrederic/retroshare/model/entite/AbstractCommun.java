package com.pereirafrederic.retroshare.model.entite;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public class AbstractCommun implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;

	@NotNull
	private LocalDateTime dateCreation;

	private LocalDateTime datemodification;
}
