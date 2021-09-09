package com.andri.service.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String user;
	private String full_name;
	private String password;
	private String token;
	private Date expiration;

}
