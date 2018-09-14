package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers("/nativequery")
		.hasAnyRole("admin")
		.and().formLogin();
		
		http.csrf().disable().authorizeRequests()
		.antMatchers("/spec")
		.hasAnyRole("admin","user")
		.and().formLogin();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("Souvik").password("{noop}12345").roles("user");
		auth.inMemoryAuthentication().withUser("Puson").password("{noop}5522").roles("admin");
		
	}
}
