package com.greatlearning.libmgmt.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.greatlearning.libmgmt.entity.Role;
import com.greatlearning.libmgmt.entity.User;

public class LmaUserDetails implements UserDetails{

	private User userEntityObj;
	
	public LmaUserDetails(User userEntityObj) {
	
		this.userEntityObj = userEntityObj;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<SimpleGrantedAuthority> authorities = new ArrayList();
		
		List<Role> allRoles = userEntityObj.getRoles();
		
		for (Role role : allRoles) {
			
			SimpleGrantedAuthority sga = new
					SimpleGrantedAuthority(role.getName());
			
			authorities.add(sga);
		}
		
		// TODO Auto-generated method stub
		return authorities;
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
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
