package com.andri.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.andri.service.jwt.JWTAuthorizationFilter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter  {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable();
		/*
		 * http.cors().and().csrf().disable().addFilterAfter(new
		 * JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
		 * .authorizeRequests() .antMatchers("/swagger-ui/**").permitAll()
		 * .antMatchers("/swagger-ui.html").permitAll()
		 * .antMatchers("/v3/api-docs/**").permitAll() .antMatchers(HttpMethod.POST,
		 * "/user").permitAll() .anyRequest().authenticated();
		 */
	}
}
