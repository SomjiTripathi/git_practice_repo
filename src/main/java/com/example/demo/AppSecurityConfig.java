package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		List<UserDetails> users =new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("somji").password("1234").roles("USER").build());
		users.add(User.withDefaultPasswordEncoder().username("atul").password("12345").roles("user").build());
		return new InMemoryUserDetailsManager(users);
	}
	
	

}
