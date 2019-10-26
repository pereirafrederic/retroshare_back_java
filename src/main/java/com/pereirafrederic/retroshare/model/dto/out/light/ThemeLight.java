package com.pereirafrederic.retroshare.model.dto.out.light;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import com.pereirafrederic.retroshare.model.dto.CommunDto;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ThemeLight extends CommunDto {

	@NotBlank
	@NotNull
	private String theme;

	@NotBlank
	@NotNull
	private String nom;

	// private image

}
