package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	

	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests()
//				.antMatchers("/user/message", "/user/getUser/**").permitAll()
			.antMatchers("/user/**").permitAll()
					.anyRequest()
						.authenticated()
								.and()
									.httpBasic();
	}
	
	
}




































//public void configure(AuthenticationManagerBuilder auth) throws Exception {
//	
//	auth.inMemoryAuthentication().withUser("Manit").password("123").roles("Admin");
//}
//
//@Bean
//public PasswordEncoder passwordEncoder() {
//	
//	return NoOpPasswordEncoder.getInstance();
//}
