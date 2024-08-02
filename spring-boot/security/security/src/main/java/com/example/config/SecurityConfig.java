package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//This annotation is used for using @preAuthorize on method level...
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	

	protected void configure(HttpSecurity http) throws Exception {
		
		System.out.println("first configure()");
		
		http
			.authorizeRequests()
//				.antMatchers("/user/message", "/user/getUser/**").permitAll()
				//.antMatchers("/user/**").permitAll()
//				.antMatchers("/user/message").hasRole("Employee")
//				.antMatchers("/user/getUser/**").hasRole("Admin")
					.anyRequest()
						.authenticated()
								.and()
									.httpBasic();
	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		System.out.println("second configure()");
		
		auth.inMemoryAuthentication().withUser("Xi").password(passwordEncoder.encode("123")).roles("Admin");
		auth.inMemoryAuthentication().withUser("jing").password(passwordEncoder.encode("234")).roles("Employee");
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
