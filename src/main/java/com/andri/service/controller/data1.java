package com.andri.service.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andri.service.model.User;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path = "/api/v1")

public class data1 {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public User data1() {
		return User.builder().user("dana").full_name("white dana").build();
	}

	@RequestMapping(path = "/user", method = RequestMethod.GET)
	@Parameter(in = ParameterIn.HEADER,description = "JWT validation",name ="Authorization--" 
	,schema = @Schema(type = "string"),required = true)
	public User getUser() {
		return User.builder().user("dana").full_name("white dan").build();
	}

	@RequestMapping(path = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@Parameter(in = ParameterIn.HEADER,description = "JWT validation",name ="Authorization" ,
	required = true)
	public User setUser(@RequestBody User user) {
		return user;
	}

}
