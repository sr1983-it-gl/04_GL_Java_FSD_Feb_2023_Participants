package com.greatlearning.sra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SRAWebSecurityConfigurerAdapter 
	extends WebSecurityConfigurerAdapter {

	// Authentication - Entry Method
	protected void configure(AuthenticationManagerBuilder auth) {

		auth.authenticationProvider(sraDaoAuthenticationProvider());
	}
	
	// Username
	@Bean
	public UserDetailsService sraUserDetailsService() {
		return new SRAUserDetailsService();
	}
	
	
	// Password
	@Bean
	public PasswordEncoder sraPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// Username + password 
	@Bean
	public DaoAuthenticationProvider sraDaoAuthenticationProvider() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(sraUserDetailsService());
		provider.setPasswordEncoder(sraPasswordEncoder());
		
		return provider;
	}
		
	// Authorization
	
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	    http.authorizeRequests()
	        .antMatchers("/", "/students/save", "/students/add-show-form", "/students/403")
	            .hasAnyAuthority("REGULAR_USER", "ADMIN_USER")
	        .antMatchers("/students/update-show-form", "/students/delete")
	            .hasAuthority("ADMIN_USER")
	        .anyRequest().authenticated()
	        .and()
	        .formLogin().loginProcessingUrl("/login").successForwardUrl("/students/list").permitAll()
	        .and()
	        .logout().logoutSuccessUrl("/login").permitAll()
	        .and()
	        .exceptionHandling().accessDeniedPage("/students/403")
	        .and()
	        .cors().and().csrf().disable();

	}	
}
