package com.greatlearning.sra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.sra.entity.User;
import com.greatlearning.sra.repository.UserRepository;

@Service
public class SRAUserDetailsService 
	implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub		
		
		User userEntityObj 
			= userRepository.fetchUserBasedOnUsername(username);
		
		SRAUserDetails sraUserDetails = 
				new SRAUserDetails(userEntityObj);
		
		return sraUserDetails;
	}

	
}
