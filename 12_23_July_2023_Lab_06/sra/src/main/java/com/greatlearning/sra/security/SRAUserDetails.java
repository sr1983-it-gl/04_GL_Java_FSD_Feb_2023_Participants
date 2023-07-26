package com.greatlearning.sra.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.greatlearning.sra.entity.Role;
import com.greatlearning.sra.entity.User;

public class SRAUserDetails 
	implements UserDetails{

	private User userEntityObj;
	
	public SRAUserDetails(User userEntityObj) {
		
		this.userEntityObj = userEntityObj;
	}
	
	
	//TODO
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<SimpleGrantedAuthority> results = new ArrayList<>();
		
		for (Role roleObj : userEntityObj.getRoles()) {
			
			String roleName = roleObj.getName();
		
			SimpleGrantedAuthority sga = new SimpleGrantedAuthority(roleName);			
			results.add(sga);
		}
		
		
		return results;
	}

	@Override
	public String getPassword() {
		return userEntityObj.getPassword();
	}

	@Override
	public String getUsername() {
		return userEntityObj.getUsername();
	}

	@Override
	// Account Expired - NO
	// Account NonExpired - YES
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	// Account Locked - NO
	// Account NonLocked - YES
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	// Credentials Expired - NO
	// Credentials NonExpired - YES	
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
