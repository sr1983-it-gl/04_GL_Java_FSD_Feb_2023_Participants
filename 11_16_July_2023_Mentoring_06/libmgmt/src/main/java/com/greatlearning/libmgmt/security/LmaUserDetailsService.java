package com.greatlearning.libmgmt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.libmgmt.entity.User;
import com.greatlearning.libmgmt.repository.UserRepository;

public class LmaUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		User userEntityObj = userRepository.findUserByUsername(username);
		
		LmaUserDetails lmaUserDetails = new LmaUserDetails(userEntityObj);
		
		return lmaUserDetails;
	}

}
