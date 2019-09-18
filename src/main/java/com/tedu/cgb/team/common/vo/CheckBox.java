package com.tedu.cgb.team.common.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckBox implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

}
