package com.softserveinc.dokazovi.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LatestUserPostDTO {

	private Integer id;

	private String title;

}
