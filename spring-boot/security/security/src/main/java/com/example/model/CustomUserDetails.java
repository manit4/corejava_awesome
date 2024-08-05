package com.example.model;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.entity.User;

public class CustomUserDetails implements UserDetails {

	User user;

	public CustomUserDetails(User user) {

		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		System.out.println("get Authority "+user.getRole());

		HashSet<SimpleGrantedAuthority> set = new HashSet<>();
		set.add(new SimpleGrantedAuthority(this.user.getRole()));

		return set;
	}

	@Override
	public String getPassword() {
		System.out.println("getPassword "+user.getPassword());
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		System.out.println("getUsername "+user.getUsername());
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		System.out.println("isAccountNonExpired");
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		System.out.println("isAccountNonLocked");
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		System.out.println("isCredentialsNonExpired");
		return true;
	}

	@Override
	public boolean isEnabled() {
		System.out.println("isEnabled()");
		
		boolean status = false;
		
		if(user.getIsEnabled().equals("true")) {
			status = true;
		}
		
		System.out.println("Status is "+status);
		
		return status;
	}
}
