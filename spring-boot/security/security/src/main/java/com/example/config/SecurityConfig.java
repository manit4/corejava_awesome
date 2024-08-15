package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.service.CustomUserDetailsService;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//This annotation is used for using @preAuthorize on method level...
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	protected void configure(HttpSecurity http) throws Exception {
		
		System.out.println("first configure()");
		
		http.cors().disable().csrf().disable()
			.authorizeRequests()
//				.antMatchers("/user/message", "/user/getUser/**").permitAll()
				//.antMatchers("/user/**").permitAll()
//				.antMatchers("/user/message").hasRole("Employee")
//				.antMatchers("/user/getUser/**").hasRole("Admin")
			
			.antMatchers("/user/registerr").permitAll()
			.antMatchers("/user/message").hasRole("Admin")
					.anyRequest()
						.authenticated()
								.and()
									.httpBasic();
	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
//		System.out.println("second configure()");
//		
//		String passwordEncodedXi = passwordEncoder.encode("123");
//		String passwordEncodedJing = passwordEncoder.encode("234");
//		
//		System.out.println("Xi Encoded Password is "+passwordEncodedXi);
//		System.out.println("Jing Encoded Password is "+passwordEncodedJing);
//		
//		auth.inMemoryAuthentication().withUser("Xi").password(passwordEncodedXi).roles("Admin");
//		auth.inMemoryAuthentication().withUser("jing").password(passwordEncodedJing).roles("Employee");
		
		auth.userDetailsService(customUserDetailsService);
		
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