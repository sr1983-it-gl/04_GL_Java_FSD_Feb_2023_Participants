package com.greatlearning.libmgmt.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class LmaCustomizedSecurity extends WebSecurityConfigurerAdapter{

	// Authentication
	
	// Username
	// Password
	// Username + password
	
	
	// Password	
	@Bean
	public PasswordEncoder mypasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService myUserDetailsService() {
		
		return new LmaUserDetailsService();
		
	}
	
	@Bean
	public DaoAuthenticationProvider myDaoAuthenticationProvider() {
	
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		
		authProvider.setUserDetailsService(myUserDetailsService());
		authProvider.setPasswordEncoder(mypasswordEncoder());
		
		return authProvider;
	}
	
	protected void configure(AuthenticationManagerBuilder builder) 
			throws Exception {
	
		builder.authenticationProvider(myDaoAuthenticationProvider());
	}
	
	// Authorization
	
	
	protected void configure(HttpSecurity http) throws Exception {

	    http.authorizeRequests()
	        .antMatchers("/", "/books/save", "/books/addStep1", "/books/403")
	            .hasAnyAuthority("REGULAR_USER", "ADMIN_USER")
	        .antMatchers("/books/updateStep1", "/books/delete")
	            .hasAuthority("ADMIN_USER")
	        .anyRequest().authenticated()
	        .and()
	        .formLogin().loginProcessingUrl("/login").successForwardUrl("/books/list").permitAll()
	        .and()
	        .logout().logoutSuccessUrl("/login").permitAll()
	        .and()
	        .exceptionHandling().accessDeniedPage("/books/403")
	        .and()
	        .cors().and().csrf().disable();

	}	
	
}
