package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;



@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//hardcoding
		/*
		 * if("root".equals(username)) { return new
		 * User("root","$2a$10$LzSuMCy35wh8Kf9ssgy...lbTjkd9l5.uJI85lAHHlNp.mKVBIIRe" ,
		 * new ArrayList<>()); }else { throw new
		 * UsernameNotFoundException("User not found with "+username); }
		 */
		
		
		
		Optional<User> user = userRepo.findByUsername(username);
		
		user.orElseThrow(()->new UsernameNotFoundException("User not found with username: "+username));
		
		//map returns optional val if present else null
		return user.map(UserDetailsImpl::new).get();	
		
	}

}
