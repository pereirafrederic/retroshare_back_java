package com.pereirafrederic.retroshare.model.dto.out.full;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import com.pereirafrederic.retroshare.model.dto.CommunDto;
import com.pereirafrederic.retroshare.model.dto.out.light.EvenementLight;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ThemeFull extends CommunDto {

	@NotBlank
	@NotNull
	private String theme;

	@NotBlank
	@NotNull
	private String nom;

	// private image

	private List<EvenementLight> evenements = new ArrayList<>();;
}
